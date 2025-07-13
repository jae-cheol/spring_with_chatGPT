# Spring AI가 무엇인가?
Spring AI는 생성형 AI 애플리케이션을 개발할 수 있도록 지원하는 Spring 프레임워크의 확장으로, 쉽게 말해 생성형 AI를 Spring Boot 애플리케이션에서 쉽게 구현할 수 있도록 추상화 및 구현체를 제공하는 역할을 한다.

Spring AI는 OpenAI(ChatGPT, DALL-E 등), Vertex AI(Gemini 등), Azure OpenAI 등 여러 AI 서비스 제공자와 통합하여 활용할 수 있다.

#

# 특징
1. 단순하고 간편한 통합 : Spring Boot 애플리케이션에 쉽게 AI 기능을 추가하고, AI 모델과의 상호작용을 단순화
2. 일관된 인터페이스 : 다양한 AI 서비스 제공자(OpenAI, Vertex AI 등)를 하나의 방식으로 사용 가능
3. 자동 설정 : 최소한의 설정으로 AI 기능을 바로 활용 가능
4. 다양한 AI 기능 지원 : 텍스트 생성, 대화형 AI, 텍스트-이미지 변환, 임베딩 모델 등 다양한 AI 기능을 구현 가능


# 프로젝트 세팅

## ChatGPT API 사이트
https://platform.openai.com/docs/overview

## 프로젝트 초기 세팅
[https://start.spring.io](https://start.spring.io/)

### SpringAI 공식 문서 사이트
https://docs.spring.io/spring-ai/reference/index.html

## yml 세팅

api-key : 본인 ChatGPT API Key

model : 사용할 모델 (gpt-4, gpt3.5, gpt-4o 등등 모델에 대한 자세한 정보는 [여기](https://platform.openai.com/docs/models) 참조)

image.options.model = 추후 강의에서 제공될 이미지 생성 모델

#

# 프롬포트 엔지니어링의 기초

while (원하는 응답이 나올때까지) {

1. AI에게 역할을 부여하기
2. AI가 해야할 일 정의하기
3. 예시 질문과 응답을 통하여 원하는 답변 이끌어내기
4. “네 알겠습니다.” 와 같은 맥락이 필요없다면 말하지 말라 지정하기

}

**프롬포트 엔지니어링의 고급언어**

제로샷 (Zero-shot) : 예제를 하나도 안주고 답변을 유도하는 기술

퓨샷 (Few-shot) : 예제를 몇가지 주고 답변을 유도하는 기술

#

# 프롬포트 엔지니어링을 활용한 챗봇 만들기

- 자바 OpenAiChatModel 의존성 주입받기

# 이미지 인식 AI 서버 만들기

- ~자바 이미지 인식 함수 코드~

# 이미지 생성 AI 서버 만들기

- 달리를 사용한 이미지 생성 AI 서버 만들기
