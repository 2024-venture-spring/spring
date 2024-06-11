<div align="center">
  <h1> 🏙아-모여!🏙 </h1>
</div>

> **삼육대학교 벤처아카데미**
>
> **개발기간: 2024.5.29~2024.6.11**

## 🙌 팀 소개

| 직책 | 이름   | 담당 파트                     |
|------|--------|-------------------------------|
| 팀장 | 심선우 | 깃헙 관리, 관리자페이지 구현  |
| 팀원 | 김현수 | ppt,  |
| 팀원 | 오송은 | 노션,  |
| 팀원 | 이은서 | 리드미,마이페이지 구현 |
| 팀원 | 이재혁 | 발표,  |

## 💡 프로젝트 소개
아-모여 는 식자재 원가 상승에 의한 싸고 좋은 물품을 구매하려면 대량으로 구매해야하는데, 이것을 소량으로 구매할수있게 주선해주는 공동구매 장려 (이웃과의 소통 장려 및 공공물가 안정) 플랫폼입니다.

#### * 주제 선정 이유 *


#### * 프로그램의 영향 *

**기대 효과**


## 🔎 개발 과정

#### ✔ 프로젝트 실행을 위한 설정
1. intellij 설치
2. mysql 설치 후, 루트권한으로 로그인하여 프로젝트 내에 있는 .sql 파일 실행
3. main 브렌치에 있는 파일을 clone 하여 실행
4. localhost:8080 으로 이동하여, 오른쪽 상단에 있는 로그인버튼을 누른 후, 회원가입 진행
5. 회원가입 후 로그인을 한 후 메인페이지의 게시글들을 확인하시어 원하는 물품을 구매신청 (결제는 추후에) 하시면됩니다.
6. 수요조사 게시판은 일정 하트수가 넘어야 공구가 진행되는 게시판이니, 공구게시판과 혼동하지않도록 주의해주세요.

** 부녀회인 경우는 관리자에게 문의하시어, 관리자 권한이 등록되어있는 계정을 제공받으시면됩니다.

#### 🔎 페이지 설명 

#### ✔ 개발 환경
![intellij](https://img.shields.io/badge/IntelliJ_IDEA-000000.svg?style=for-the-badge&logo=intellij-idea&logoColor=white)
<img src="https://img.shields.io/badge/Thymeleaf-005F0F?style=for-the-badge&logo=Thymeleaf&logoColor=white">
<img src="https://img.shields.io/badge/springboot-6DB33F?style=for-the-badge&logo=springboot&logoColor=white">
<img src="https://img.shields.io/badge/html5-E34F26?style=for-the-badge&logo=html5&logoColor=white">
<img src="https://img.shields.io/badge/css-1572B6?style=for-the-badge&logo=css3&logoColor=white">
<img src="https://img.shields.io/badge/javascript-F7DF1E?style=for-the-badge&logo=javascript&logoColor=black">
<img src="https://img.shields.io/badge/mysql-4479A1?style=for-the-badge&logo=mysql&logoColor=white">
<img src="https://img.shields.io/badge/mysqlworkbench-0A648C?style=for-the-badge&logo=mysql&logoColor=white">
<img src="https://img.shields.io/badge/JPA-CCCCCC?style=for-the-badge&logo=&logoColor=white">




#### ✔ 협업 툴
<a href = "https://cooked-tumbleweed-b51.notion.site/1b0122ceef10446183be0719a9e9133c?pvs=4">![Notion](https://img.shields.io/badge/notion-FCBFBD?style=for-the-badge&logo=notion&logoColor=white)</a>
![GitHub](https://img.shields.io/badge/GitHub-FECC00?style=for-the-badge&logo=GitHub&logoColor=white)
<img src="https://img.shields.io/badge/Figma-F24E1E?style=for-the-badge&logo=figma&logoColor=white">

## 📌 ER 다이어그램


## 📌 브랜치 활용

- **main 브랜치:** 최종 코드 관리 브랜치로, prototype 브랜치에서 문제가 없으면,merge 해서 사용
- **feature 브랜치:** 각자 담당한 기능 단위로 브랜치를 나누어서 사용
- **dev 브랜치:** 머지 한 후 기능이 작동되는 지 확인하는 브렌치.

## ⚙ 프로그램 주요 기능

  
## 🗂️프로그램구조도
# Project Structure
```plaintext
project-root
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── venture
│   │   │           └── spring
│   │   │               ├── Application.java
│   │   │               ├── controller
│   │   │               │   ├── MainController.java
│   │   │               │   └── 
│   │   └── resources
│   │       ├── static
│   │       │   ├── css
│   │       │   │   ├── style.css
│   │       │   │   ├── admin-userpage.css
│   │       │   │   ├── adminpage.css
│   │       │   │   ├── listde.css
│   │       │   │   ├── login.css
│   │       │   │   ├── lostwrite.css
│   │       │   │   ├── register.css
│   │       │   │   ├── trade.css
│   │       │   │   ├── write.css
│   │       │   ├── img
│   │       │   │   ├── asf.png
│   │       │   │   ├── bean.gif
│   │       │   │   ├── campus.png
│   │       │   │   ├── Ckong.jpg
│   │       │   │   ├──logo.png
│   │       │   │   ├── main1.png
│   │       │   │   ├── main2.png
│   │       │   │   ├── Skong.jpg
│   │       │   ├── js
│   │       │   │   ├── admin-userpage.js
│   │       │   │   ├── adminpage.js
│   │       │   │   ├── adminpost.js
│   │       │   │   ├── chat.js
│   │       │   │   ├── listdetail.js
│   │       │   │   ├── posts.js
│   │       │   │   ├── write.js
│   │       ├── templates
│   │       │   ├── trade
│   │       │   │   ├── list.html
│   │       │   │   ├── listde.html
│   │       │   │   ├── lost.html
│   │       │   │   ├── lostwrite.html
│   │       │   │   ├── posts.html
│   │       │   │   ├── write.html
│   │       │   ├── fragments
│   │       │       ├── admin-header.html
│   │       │       ├── footer.html
│   │       │       ├─- header.html
│   │       ├── admin-login.html
│   │       ├── agree.html
│   │       ├── chatroo.html
│   │       ├── index.html
│   │       ├── login.html
│   │       ├── register.html
│   │       ├── application.properties
│   │       └── data.sql (optional, for initial data setup)
│       └── java
│           └── com
│               └── venture
│                   └── suyaho
│                       └── SuyahoApplicationTests.java
└── build.gradle

```

## 🙏 개발 후기
#### [_심선우 ]


#### [_김현수 ]

#### [ 오송은 ]

#### [_이은서 ]

#### [_이재혁 ]
