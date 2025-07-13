package com.spring.jc

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/ai")
class AiController (
        private val aiService: AiService
){

    /**
     * 프롬프트 엔지니어링을 바탕으로한 챗봇 만들기
     */
    @PostMapping
    fun chatBot(
            @RequestBody request: Request
    ) {
        aiService.chatbot(request)
    }

    /**
     * 이미지 인식 AI 서버 만들기
     */
    @PostMapping("/image")
    fun imageAi(
            @RequestBody request: Request
    ) {
        aiService.imageAi(request)
    }

    /**
     * 이미지 생성 AI 서버 만들기
     */
    @PostMapping("/gen")
    fun imageGenAi(
        @RequestBody request: Request
    ) {
        aiService.imageGenAi(request)
    }
}