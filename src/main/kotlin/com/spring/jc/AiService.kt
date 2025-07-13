package com.spring.jc

import org.springframework.ai.chat.prompt.PromptTemplate
import org.springframework.ai.image.ImagePrompt
import org.springframework.ai.openai.OpenAiChatModel
import org.springframework.ai.openai.OpenAiImageModel
import org.springframework.ai.openai.OpenAiImageOptions
import org.springframework.stereotype.Service


@Service
class AiService (
        private val openAiChatModel : OpenAiChatModel,
        private val openAiImageApi: OpenAiImageModel,
){
    fun chatbot(request: Request) {

//        val promptTemplate = PromptTemplate(
//                "당신은 의사야 그래서 환자의 증상을 바탕으로 환자의 병을 예측해줘\n"
//                        + "환자가 자신의 증상을 말하면 너의 지식으로 잘 최대한 친절하게 알려줘.\n"
//                        + "환자 : 배가 너무 아파요\n"
//                        + "답변 : 배탈인 것 같습니다.\n"
//                        + "환자 : 머리가 너무 아파요\n"
//                        + "답변 : 두통인 것 같습니다.\n"
//                        + "환자 : 기침을 해요\n"
//                        + "답변 : 감기인 것 같습니다.\n"
//                        + "이런 형식으로 내가 말한 예시대로 대답해줘. (답변 : ) 과 같은 맥락은 빼고 대답해줘"
//                        + "환자 : {message}\n"
//        )
        val promptTemplate = PromptTemplate(
                "당신은 의사야 그래서 환자의 증상을 바탕으로 환자의 병을 예측해줘\n"
                        + "환자가 자신의 증상을 말하면 너의 지식으로 잘 최대한 친절하게 알려줘.\n"
                        + "환자 : {message}\n"
        )

        val prompt = promptTemplate.create(mapOf("message" to request.text))

        // String이나 prompt enginering 한 값을 생성해서 반환해주는 함수
        println(openAiChatModel.call(prompt).result.output)

    }

    fun imageAi(request: Request) {
        /**
         * [2025-07-13] call은 Prompt타입만 받도록 정의되어있음.
         *
         */
//        val prompt = "사진을 보고 뭔지 판단해줘"
//        val imageResource: Resource = DefaultResourceLoader().getResource("http://example.com/image.jpg")
//        val userMessage = UserMessage(prompt, attachments = listOf(Media(MimeTypeUtils.IMAGE_JPEG, imageResource)))
//
//        println(openAiChatModel.call(userMessage))
    }

    fun imageGenAi(request: Request) {
        val prompt = "사용자가 글을 입력하면 너는 최상의 그림을 그려줘\n" + "그림은 꼭 만화그림처럼 그려야 해\n" + "그림에 사람이 꼭 2명씩 있어야해.\n" + request.text
        val url = openAiImageApi.call(
            ImagePrompt(prompt, OpenAiImageOptions.builder()
                    .quality("hd")
                    .N(1)
                    .width(1024)
                    .height(1024)
                    .build())
        ).result.output.url

        println(url)
    }
}