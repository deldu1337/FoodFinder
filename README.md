# FoodFinder
# 사용자가 원하는 옵션을 선택하거나 가지고 있는 재료를 저장하면, 그것을 기반으로 알맞은 메뉴 추천과 레시피를 제공해주는 웹 서비스
#### 프로젝트 개발 기간 : 2022.02 ~ 2022.06
#### 프로젝트 개발 인원 : 4인
-----------------------
## Index
- [Description](https://github.com/deldu1337/FoodFinder/blob/main/README.md#description)
  - [PART 1. 프로그램 제공 기능](https://github.com/deldu1337/FoodFinder/blob/main/README.md#part-1-%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%A8-%EC%A0%9C%EA%B3%B5-%EA%B8%B0%EB%8A%A5)
  - [PART 2. 프로그램 구성](https://github.com/deldu1337/FoodFinder/blob/main/README.md#part-2-%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%A8-%EA%B5%AC%EC%84%B1)
  - [PART 3. 화면 구성 및 세부 기능](https://github.com/deldu1337/FoodFinder/blob/main/README.md#part-3-%ED%99%94%EB%A9%B4-%EA%B5%AC%EC%84%B1-%EB%B0%8F-%EC%84%B8%EB%B6%80-%EA%B8%B0%EB%8A%A5)
- [Environment](https://github.com/deldu1337/FoodFinder/blob/main/README.md#environment)
## Description
### PART 1. 프로그램 제공 기능
- 레시피 기능
- 식당 추천 기능
- 냉장고 기능
- 게시판 기능

### PART 2. 프로그램 구성
![image](https://user-images.githubusercontent.com/77719450/196601452-081b0328-0928-4590-8443-17ae04ff9116.png)

### PART 3. 화면 구성 및 세부 기능
 ## 메인 화면
 ![메인화면1](https://user-images.githubusercontent.com/77719450/216753752-4fa106af-eea8-4542-9a16-714e693ec866.PNG)
 ![메인화면2](https://user-images.githubusercontent.com/77719450/216753798-f6f10a4e-4099-4207-8321-382e5598ca61.PNG)

 1. 상단에 앱 로고 표시
 2. 레시피, 식당 추천, 냉장고, 게시판 기능이 구현되어 있으며 각각의 기능은 썸네일이 존재
 3. 구현된 기능 중 하나를 클릭할 시 해당 기능 화면 이동
 4. 상단에 앱 로고 클릭 시, 메인 화면 이동
 5. 우측 상단에 **Login** 버튼 클릭 시, 로그인 화면 이동
 
 ## 로그인
 ![로그인](https://user-images.githubusercontent.com/77719450/216753895-93a31387-2581-44f7-8d62-c02f411ac830.PNG)
 
 1. 알맞은 이메일과 비밀번호 입력 후 **로그인** 버튼 클릭 시, 로그인
 2. **회원가입** 버튼 클릭 시, 회원가입 화면 이동
 3. 정상적인 로그인 시, 우측 상단에 **Login** 버튼 대신 **Logout**, **MyPage** 버튼 표시
 4. **Logout** 버튼 클릭 시, 로그아웃
 5. **MyPage** 버튼 클릭 시, 마이페이지 화면 이동

 ## 회원가입
 ![회원가입](https://user-images.githubusercontent.com/77719450/216753896-fcf14cc5-7bed-493b-ba7b-2b8d423d0993.PNG)
 
 1. 알맞은 이름(닉네임), 이메일, 전화번호, 비밀번호 입력 후 **회원가입** 버튼 클릭 시, 회원가입 
 
 ## 마이페이지
 ![마이페이지](https://user-images.githubusercontent.com/77719450/216754135-15bfedd2-0ba2-4e3c-b947-0b72a8cf470a.PNG)

 1. 사용자의 이름(닉네임), 이메일, 프로필 사진 표시
 2. 사용자의 이름(닉네임) 우측 펜 모양 버튼 클릭 시, 프로필 수정 화면 이동
 3. **회원 정보 수정** 버튼 클릭 시, 회원 정보 수정 화면 이동
 4. **내가 쓴 글** 버튼 클릭 시, 내가 쓴 글 화면 이동

 ## 프로필 수정
 ![프로필수정](https://user-images.githubusercontent.com/77719450/216754659-81214378-ea93-4539-bb4a-3f6fdc39c30d.PNG)

 1. 프로필 사진 및 이름(닉네임) 변경 기능 제공
 2. **수정** 버튼 클릭 시, 수정 내용 반영

 ## 회원 정보 수정
 ![회원정보수정](https://user-images.githubusercontent.com/77719450/216754651-5e7201eb-e408-4288-9261-39035b68d6a3.PNG)

 1. 사용자의 이메일, 이름(닉네임), 전화번호 표시
 2. 전화번호, 비밀번호 변경 기능 제공
 3. **수정** 버튼 클릭 시, 수정 내용 반영
 
 ## 내가 쓴 글
 ![내가쓴글](https://user-images.githubusercontent.com/77719450/216754644-a95a1635-84c8-48d7-a79f-3e4d78a42963.PNG)

 1. 게시판에 사용자 본인이 쓴 글 표시
 2. 게시글 클릭 시, 레시피 세부 화면 이동
 
 ## 레시피
 ![레시피1](https://user-images.githubusercontent.com/77719450/216755101-91a63be9-6d7c-4fed-a594-31efebef3679.PNG)
 ![레시피2](https://user-images.githubusercontent.com/77719450/216755106-97589ab5-7d28-4fc6-a52f-68ff4d1e503a.PNG)
 ![레시피3](https://user-images.githubusercontent.com/77719450/216755109-a50eed2d-84d9-4ea0-9fee-2c7cf7bb08e2.PNG)
 ![레시피4](https://user-images.githubusercontent.com/77719450/216755191-67fd27ac-9499-4798-a8f2-7bcb28b82436.PNG)
 
 1. 레시피 추천을 위한 옵션 선택 (중복 선택 가능)
 2. **찾기**를 클릭하면 옵션 선택 기반으로 음식 메뉴 추천
 3. 통합 검색 기능 제공
 4. 음식 메뉴 목록에서 각 메뉴를 클릭하면, 레시피 세부 화면 이동
 
 ## 식당 추천
 ![식당추천1](https://user-images.githubusercontent.com/77719450/216755647-ba8b6ab4-f5e2-4942-99a4-e0a41e3de620.PNG)
 ![식당추천2](https://user-images.githubusercontent.com/77719450/216755655-a84673fe-6cae-4bd4-ab3c-c2c97d6dd46d.PNG)
 ![식당추천3](https://user-images.githubusercontent.com/77719450/216755691-013e70fc-b863-4e19-9bb0-061585a485c6.PNG)
 
 1. 식당 추천을 위한 옵션 선택 (중복 선택 가능)
 2. **찾기**를 클릭하면 옵션 선택 기반으로 음식 메뉴 추천
 3. 음식 메뉴 목록에서 각 메뉴를 클릭하면, 해당하는 메뉴에 대해 현재 위치를 기반한 주변 식당 추천
 4. **상세보기** 클릭 시, 카카오맵과 연동된 상세 화면 이동
 
 ## 냉장고
 ![냉장고1](https://user-images.githubusercontent.com/77719450/216755978-97257504-17a5-4ec7-8f5c-5ab15a8c36c9.PNG)
 ![냉장고2](https://user-images.githubusercontent.com/77719450/216755980-b71e807c-3ea9-4f4c-8ef1-6afca9d1dae4.PNG)
 
 1. 사용자 본인이 소유하고 있는 재료를 냉장고 메뉴에 추가하여 그 재료를 기반으로 알맞은 음식 및 레시피 검색
 2. 냉장고 메뉴에서 재료를 추가 및 삭제한 뒤, **수정하기** 버튼을 클릭하면 수정 반영
 3. **레시피 검색** 버튼 클릭 시, 냉장고 재료 기반으로 음식 메뉴 추천
 
 ## 게시판
 ![게시판1](https://user-images.githubusercontent.com/77719450/216758629-0ea9a39c-ba3e-458f-ad81-5001d3fd0ae8.PNG)
 ![게시판2](https://user-images.githubusercontent.com/77719450/216756445-bac6d813-201f-45ae-8886-859ccbd245bd.PNG)
 ![게시판3](https://user-images.githubusercontent.com/77719450/216758702-667b0123-4934-4692-92b9-dd0e55b83b82.PNG)
 
 1. 본인만의 레시피를 게시판에 업로드
 2. **글쓰기** 버튼 클릭 시, 게시판 글쓰기 화면 이동
 3. 게시판 이용자들과 서로 레시피 공유 및 자유로운 소통 가능
 
-----------------------
## Environment
 > Java Version 11.0.12
 > 
 > SpringFrameWork Version 5.3.16
 >
 > Spring-boot Version 2.6.4
 > 
 > gradle Version 7.4
 >
 > Node.js Version 16.17.0
 >
 > React Version 17.0.2
 >
 > IntelliJ IDEA Version 2021.3.2
 >
 > Visual Studio Code IDE Version 2022-09 (1.72.0)
 >
 > MySQL Version 8.0.26
