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
| 팀원 | 오송은 | 노션, 공구페이지, 로그인-회원가입 페이지 구현, 문의하기 페이지 구현|
| 팀원 | 이은서 | 리드미,마이페이지, 공지사항페이지 구현 |
| 팀원 | 이재혁 | 발표, 공구페이지 구현 |

## 💡 프로젝트 소개
아-모여는 식자재 원가 상승으로 인해 소비자들이 경제적으로 부담을 느끼는 상황에서, 싸고 좋은 물품을 소량으로 구매할 수 있도록 주선해주는 공동구매 장려 플랫폼입니다. 이 플랫폼을 통해 소비자들은 대량 구매의 이점을 누리면서도 필요한 만큼만 구매할 수 있게 됩니다.
#### * 주제 선정 이유 *
- 최근 원자재 가격이 급등하면서 많은 서민들이 경제적 부담을 겪고 있습니다. 이러한 상황에서 공동구매는 소비자들이 생산지에서 대량으로 좋은 품질의 제품을 적정한 가격에 구할 수 있는 좋은 방법입니다. 공동구매를 통해 소비자들은 대량 구매의 혜택을 나눌 수 있고, 더 합리적인 가격으로 원하는 만큼만 구매할 수 있습니다. 이를 통해 경제적 부담을 줄이고, 소비자들이 보다 합리적인 소비를 할 수 있도록 돕고자 이 프로젝트를 기획하게 되었습니다.

#### * 프로그램의 영향 *

🥦 기대효과

경제적 부담 완화
- 공동구매를 통해 원자재 가격 급등으로 인한 부담을 여러 소비자가 나눠 갖게 됩니다. 이를 통해 소비자들은 합리적인 가격으로 고품질의 제품을 제공받을 수 있게 되어 경제적 부담이 완화됩니다.

합리적인 소비
- 소량 구매도 도매의 혜택을 누릴 수 있게 되면서 소비자들의 구매력이 향상됩니다. 이를 통해 소비자들은 보다 합리적이고 효율적인 소비를 할 수 있습니다.

지역 경제 활성화
- 생산지에서 직접 구매함으로써 지역 경제에도 긍정적인 영향을 미칠 수 있습니다. 중간 유통 단계를 줄임으로써 생산자와 소비자 모두에게 이익이 돌아가며, 지역 경제가 활성화되는 효과를 기대할 수 있습니다.

이웃과의 소통
- 공동구매를 통해 소비자들 간의 협력과 소통이 증가합니다. 이는 자연스럽게 커뮤니티 형성으로 이어지며, 동네사람들과의 커뮤니케이션이 더더욱 강해질 것입니다.

환경 보호
- 대량 구매를 통해 불필요한 낭비를 줄임으로써 환경 보호에도 기여할 수 있습니다. 이는 지속 가능한 소비와 환경 보호에 긍정적인 영향을 미칠 것입니다.

이와 같은 여러 기대 효과를 통해 아-모여는 경제적 부담을 덜고, 합리적인 소비를 촉진하며, 지역 경제를 활성화하고, 사회적 연대를 강화하며, 환경 보호에 기여하는 다목적 플랫폼으로 자리잡을 것입니다.
## 🔎 개발 과정

#### ✔ 프로젝트 실행을 위한 설정
✔ 프로젝트 실행을 위한 설정

1. IntelliJ 설치
2. MySQL 설치 후 설정
- 루트 권한으로 로그인하여 프로젝트 내에 있는 .sql 파일 실행
3. 프로젝트 다운
- main 브랜치에 있는 파일을 clone 하여 실행
4. 프로젝트 실행
- localhost:8080으로 이동하여 로그인 버튼 클릭 후 회원가입 진행
- 회원가입 후 로그인하고 메인 페이지의 게시글에서 원하는 물품 구매 신청 (결제는 플랫폼에서 지원하지 않고 신청내역은 마이페이지에서 확인가능.)
- 수요조사 게시판 : 일정 하트 수를 넘어야 공구가 진행되는 게시판이므로, 공구 게시판과 혼동하지 않도록 주의하도록합니다.
** 부녀회인 경우는 관리자에게 문의하여, 관리자 권한이 등록된 계정을 제공받으시면 됩니다.
#### 🔎 페이지 설명 
1. 메인페이지 : 공구페이지와 수요조사 페이지로 나뉘어져있습니다. 로그인 후 공구페이지에서 원하는 물품을 신청하여 구매내역 페이지에서 확인할수있습니다. 수요조사페이지는 일정 관심을 받으면 공구가 진행됩니다.
2. 로그인페이지 : 로그인/회원가입 페이지.
3. 마이페이지: 회원가입시 입력한 정보를 수정할수있고, 구매신청한 물품을 리스트로 볼수있으며 취소할수도있습니다. 수요조사에 응한 페이지를 볼수있습니다. (좋아요페이지만 상세페이지를 확인과 좋아요 취소할수있습니다)
4. 관리자페이지: 글을 작성할수있고, 유저보기, 게시글 관리를 할수있습니다.
5. 자주묻는질문 페이지 : 자주묻는 질문을 정리하여 나타내는 페이지 오른쪽 하단의 상담원 모양을 클릭 한 후 상단에서부터 세번째 (문자모양) 을 클릭하시면 FAQ 페이지로 연결됩니다.
6. 공지사항 페이지: 관리자만이 쓸수있으며, 전체 공지사항 게시판입니다. 오른쪽 하단에 상담원 표시를 누른 후, 상단에서 두번째 (지구본모양) 을 클릭하면 공지사항 페이지로 연결됩니다.



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
1. 회원가입 및 로그인
- 사용자는 회원가입 후 로그인을 통해 서비스를 이용할 수 있습니다.
2. 공구 게시판
- 사용자는 공구 게시판에서 진행 중인 공동구매 상품을 확인하고 구매 신청을 할 수 있습니다.
3. 수요조사 게시판
- 사용자는 수요조사 게시판에서 관심 있는 상품에 대해 하트를 눌러 수요를 조사할 수 있으며, 일정 하트 수를 넘으면 공동구매가 진행됩니다.
4. 마이페이지
- 마이페이지 에서 회원가입할때 입력한 정보를 수정할수있으며, 사용자는 마이페이지에서 자신이 구매 신청한 내역을 확인하고 취소할 수 있고 좋아요(수요조사페이지) 에 참여한다는 표시를 철회할수있습니다..
5. 관리자 페이지
- 관리자는 관리자 페이지에서 게시글 작성, 유저 관리, 게시글 관리 및 게시글 작성 등의 기능을 수행할 수 있습니다.
6. 공지사항 및 FAQ
- 사용자는 공지사항 페이지에서 최신 공지사항을 확인하고, FAQ 페이지에서 자주 묻는 질문에 대한 답변을 찾을 수 있고, 관리자의 경우는 공지사항을 작성할수있습니다.
  
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
│   │               │   ├── MapperConfiguration.java
│   │               │   └── WebConfiguration.java
│   │               ├── controller
│   │               │   └── MainController.java
│   │               ├── entity
│   │               │   ├── BuyingUser.java
│   │               │   ├── BuyingUserId.java
│   │               │   ├── GroupBuying.java
│   │               │   ├── Image.java
│   │               │   ├── Likes.java
│   │               │   ├── Notice.java
│   │               │   ├── RequireBuy.java
│   │               │   └── Users.java
│   │               ├── gonggu
│   │               │   ├── controller
│   │               │   │   └── GongguController.java
│   │               │   ├── dto
│   │               │   │   ├── BuyingUserDTO.java
│   │               │   │   ├── BuyingUserIdDTO.java
│   │               │   │   ├── GroupBuyingDTO.java
│   │               │   │   ├── ImageDTO.java
│   │               │   │   ├── LikesDTO.java
│   │               │   │   ├── RequireBuyDTO.java
│   │               │   │   └── UserDTO.java
│   │               │   ├── repository
│   │               │   │   ├── DTORepository.java
│   │               │   │   ├── GroupBuyingRepository.java
│   │               │   │   ├── ImageRepository.java
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
│   │               ├── notice
│   │               │   ├── controller
│   │               │   │   └── NoticeController.java
│   │               │   ├── repository
│   │               │   │   ├── NoticeRepository.java
│   │               │   │   └── UserRepository.java
│   │               │   └── service
│   │               │       └── NoticeService.java
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
│       │   │   ├── contact.css
│       │   │   ├── info.css
│       │   │   ├── menu.css
│       │   │   ├── mypage
│       │   │   │   ├── mypage.css
│       │   │   │   ├── mywritelist.css
│       │   │   │   ├── notice.css
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
│       │       ├── info.js
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
│           ├── document
│           │   └── terms.html
│           ├── fragments
│           │   └── common.html
│           ├── index.html
│           ├── info
│           │   ├── contact.html
│           │   ├── frequentlyAsk.html
│           │   ├── info.html
│           │   ├── notice_detail.html
│           │   └── notice_form.html
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
- 저번 팀플에서 게시판 기능을 제대로만들지못해서 아쉬웠는데 지금은 잘 되서 만족하고, 저번 팀플에는 배우는 중이라서 적용하지못하였던 기법들을 이번 팀프로젝트에 적용하니까 생각보다 적용하는과정이 어려웠지만 잘 적용되어 만족합니다.

#### [ 이재혁 ]

