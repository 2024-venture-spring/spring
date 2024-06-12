<div align="center">
  <h1> 🏙아-모여!🏙 </h1>
</div>

> **삼육대학교 벤처아카데미**
>
> **개발기간: 2024.5.29~2024.6.13**

## 🙌 팀 소개

| 직책 | 이름   | 담당 파트                     |
|------|--------|-------------------------------|
| 팀장 | 심선우 | 깃헙 관리, 관리자페이지 구현  |
| 팀원 | 김현수 | ppt,물가 페이지 구현  |
| 팀원 | 오송은 | 노션, 공구페이지 구현 |
| 팀원 | 이은서 | 리드미,마이페이지 구현 |
| 팀원 | 이재혁 | 발표, 공구페이지 구현 |

## 💡 프로젝트 소개
아-모여 는 식자재 원가 상승에 의한 싸고 좋은 물품을 구매하려면 대량으로 구매해야하는데, 이것을 소량으로 구매할수있게 주선해주는 공동구매 장려 플랫폼입니다.

#### * 주제 선정 이유 *
- 원자재 가격의 급등으로 서민들의 경제적 부담이 심화되고 있는 가운데, 공동구매를 통해 생산지에서 대량으로 좋은 품질의 제품을 적정한 가격에 원하는 만큼 구매할 수 있도록 하고자 합니다.

#### * 프로그램의 영향 *

**기대 효과**
- 경제적 부담 완화: 공동구매를 통해 원자재 가격 급등으로 인한 부담을 분담하고, 합리적인 가격에 고품질의 제품을 제공받을 수 있습니다.
- 합리적인 소비 촉진: 소량 구매도 도매의 혜택을 누릴 수 있어, 소비자들의 구매력이 향상됩니다.
- 지역 경제 활성화: 생산지에서 직접 구매함으로써 지역 경제에 긍정적인 영향을 미치고, 중간 유통 단계를 줄여 생산자와 소비자 모두에게 이익이 돌아갑니다.
- 사회적 연대 강화: 공동구매를 통해 소비자들 간의 협력과 연대 의식이 강화되며, 커뮤니티 형성에도 기여합니다.
- 환경 보호: 대량 구매를 통한 포장재 절감 등으로 환경 보호에도 기여할 수 있습니다.

## 🔎 개발 과정

#### ✔ 프로젝트 실행을 위한 설정
1. intellij 설치
2. mysql 설치 후, 루트권한으로 로그인하여 프로젝트 내에 있는 .sql 파일 실행
3. main 브렌치에 있는 파일을 clone 하여 실행
4. localhost:8080 으로 이동하여, 오른쪽 상단에 있는 로그인버튼을 누른 후, 회원가입 진행
5. 회원가입 후 로그인을 한 후 메인페이지의 게시글들을 확인하시어 원하는 물품을 구매신청 (결제는 저희 플랫폼에서 지원하지않습니다.) 하시면됩니다.
6. 수요조사 게시판은 일정 하트수가 넘어야 공구가 진행되는 게시판이니, 공구게시판과 혼동하지않도록 주의해주세요.

** 부녀회인 경우는 관리자에게 문의하시어, 관리자 권한이 등록되어있는 계정을 제공받으시면됩니다.

#### 🔎 페이지 설명 
1. 메인페이지 : 공구페이지와 수요조사 페이지로 나뉘어져있음. 로그인 후 공구페이지에서 원하는 물품을 신청. 수요조사페이지는 일정 관심을 받으면 공구가 진행됩니다.
2. 로그인페이지 : 로그인/회원가입 페이지.
3. 마이페이지: 회원가입시 입력한 정보를 수정할수있고, 구매신청한 물품을 리스트로 볼수있고, 수요조사에 응한 페이지를 볼수있습니다. (좋아요페이지만 상세페이지를 확인할수있고, 좋아요 누른것을 취소할수있습니다)
4. 관리자페이지: 글을 작성할수있고, 유저보기, 게시글 관리를 할수있음.
5. 자주묻는질문 페이지 : 자주묻는 질문을 정리한페이지.


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

- **main 브랜치:** 최종 코드 관리 브랜치로, dev 브랜치에서 문제가 없으면,merge 해서 사용
- **feature 브랜치:** 각자 담당한 기능 단위로 브랜치를 나누어서 사용
- **dev 브랜치:** 머지 한 후 기능이 작동되는 지 확인하는 브렌치.

## ⚙ 프로그램 주요 기능

  
## 🗂️프로그램구조도
# Project Structure
```plaintext
project-root
├── main
│   ├── java
│   │   └── com
│   │       └── ohgiraffers
│   │           └── springlastteam
│   │               ├── SpringLastTeamApplication.java
│   │               ├── admin
│   │               │   ├── controller
│   │               │   │   └── AdminController.java
│   │               │   ├── dto
│   │               │   │   ├── GroupBuyingDTO.java
│   │               │   │   └── ImageDTO.java
│   │               │   ├── repository
│   │               │   │   ├── BuyingUserRepository.java
│   │               │   │   ├── GroupBuyingRepository.java
│   │               │   │   ├── ImageRepository.java
│   │               │   │   └── UserRepository.java
│   │               │   └── service
│   │               │       └── AdminService.java
│   │               ├── config
│   │               │   └── MapperConfiguration.java
│   │               ├── controller
│   │               │   └── MainController.java
│   │               ├── entity
│   │               │   ├── BuyingUser.java
│   │               │   ├── BuyingUserId.java
│   │               │   ├── GroupBuying.java
│   │               │   ├── Image.java
│   │               │   ├── Likes.java
│   │               │   ├── RequireBuy.java
│   │               │   └── Users.java
│   │               ├── gonggu
│   │               │   ├── controller
│   │               │   │   └── GongguController.java
│   │               │   ├── dto
│   │               │   │   ├── BuyingUserDTO.java
│   │               │   │   ├── BuyingUserIdDTO.java
│   │               │   │   ├── GroupBuyingDTO.java
│   │               │   │   ├── LikesDTO.java
│   │               │   │   ├── RequireBuyDTO.java
│   │               │   │   └── UserDTO.java
│   │               │   ├── repository
│   │               │   │   ├── DTORepository.java
│   │               │   │   ├── GroupBuyingRepository.java
│   │               │   │   ├── LikesRepository.java
│   │               │   │   ├── RequireBuyRepository.java
│   │               │   │   └── UserRepository.java
│   │               │   └── service
│   │               │       └── DTOService.java
│   │               ├── login
│   │               │   ├── controller
│   │               │   │   └── LoginController.java
│   │               │   ├── dto
│   │               │   │   └── UserDTO.java
│   │               │   ├── repository
│   │               │   │   └── LoginRepository.java
│   │               │   └── service
│   │               │       ├── UserService.java
│   │               │       └── UserServiceImpl.java
│   │               ├── mypage
│   │               │   ├── controller
│   │               │   │   └── MypageController.java
│   │               │   └── repository
│   │               │       ├── MyPageBuyingUserRepository.java
│   │               │       ├── MyPageGroupBuyingRepository.java
│   │               │       ├── MyPageLikeRepository.java
│   │               │       └── MyPageRequireBuyRepository.java
│   │               └── price
│   │                   ├── PriceController.java
│   │                   └── PriceDTO.java
│   └── resources
│       ├── application.yml
│       ├── static
│       │   ├── css
│       │   │   ├── admin
│       │   │   │   ├── addpost.css
│       │   │   │   ├── admin-list.css
│       │   │   │   ├── admin-post.css
│       │   │   │   └── admin-user.css
│       │   │   ├── info.css
│       │   │   ├── menu.css
│       │   │   ├── mypage
│       │   │   │   ├── mypage.css
│       │   │   │   ├── mywritelist.css
│       │   │   │   ├── purchashistory.css
│       │   │   │   └── sdf.css
│       │   │   ├── price.css
│       │   │   └── signup.css
│       │   ├── img
│       │   │   ├── after-dollar.png
│       │   │   ├── after-home.png
│       │   │   ├── after-notification.png
│       │   │   ├── after-plus.png
│       │   │   ├── after-profile.png
│       │   │   ├── after-search.png
│       │   │   ├── before-dollar.png
│       │   │   ├── before-home.png
│       │   │   ├── before-notification.png
│       │   │   ├── before-plus.png
│       │   │   ├── before-profile.png
│       │   │   ├── before-search.png
│       │   │   ├── check-circle.svg
│       │   │   ├── default-profile.png
│       │   │   ├── heart-icon-red.png
│       │   │   ├── heart-icon.png
│       │   │   ├── logo.jpeg
│       │   │   ├── profile_image.png
│       │   │   └── sweet-potatoes.png
│       │   └── js
│       │       ├── addpost.js
│       │       ├── admin.js
│       │       ├── content.js
│       │       ├── menu.js
│       │       ├── mypage.js
│       │       └── post.js
│       └── templates
│           ├── admin
│           │   ├── addpost.html
│           │   ├── admin-list.html
│           │   ├── admin-post.html
│           │   ├── admin-user.html
│           │   ├── footer.html
│           │   └── sidebar.html
│           ├── data
│           │   ├── delete.html
│           │   ├── list.html
│           │   └── save.html
│           ├── fragments
│           │   └── common.html
│           ├── index.html
│           ├── info
│           │   ├── frequentlyAsk.html
│           │   └── info.html
│           ├── login.html
│           ├── mypage
│           │   ├── footer.html
│           │   ├── likelist.html
│           │   ├── mypage.html
│           │   ├── mywritelist.html
│           │   ├── purchashistory.html
│           │   ├── requirebuydetails.html
│           │   └── sidebar.html
│           ├── price.html
│           ├── register.html
│           └── want.html
└── test
    └── java
        └── com
            └── ohgiraffers
                └── springlastteam
                    └── SpringLastTeamApplicationTests.java



```

## 🙏 개발 후기
#### [ 심선우 ]


#### [ 김현수 ]

#### [ 오송은 ]

#### [ 이은서 ]

#### [ 이재혁 ]
