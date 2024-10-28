## 내용
횡이동 타자게임 프로그래밍 (웹포함)

## 목적
1. Java로 Soket의 개념 이해 및 멀티 스레드 이해
2. 디자인패턴 적용해보기
3. 프레임워크를 사용하지 않고 프로그래밍을 진행할 시에 시행착오
4. OOP에 대한 이해

## 구성
- 스테이지 레벨 6단계로 구성
- 2인까지 멀티플레이 가능
- 명예의 전당 (웹 구성예정) (op.gg 오마쥬)


## 군인
3명의 군인을 선택 가능함

- 이름: James Carter
- 이름: David Thompson
- 이름: John Miller

1. 공격력
    - 3명의 군인 모두 공격력 10
    - 업그레이드 추가 공격력 + 5
2. 체력
    - 3명의 군인 모두 체력 10
    - 업그레이드 추가 체력 + 5
3. 위치값
    - 중앙값
    - 멀티 플레이시, 1p랑 2p의 간격 100px 정도 차이
4. 이미지 모션
    - 스테이지가 단계가 증가됨에 따라 걷는 이미지에서 뛰는 이미지로 변경


## 좀비
- 1단계 ~ 2단계
    - 남자좀비
    - 8초당 1명 생성
- 3단계 ~ 4단계
    - 남자, 여자 좀비
    - 5초당 1명 생성
- 5단계 ~ 6단계
    - 남자, 여자, 와일드 좀비
    - 3초당 1명 생성


1. 공격력
    - 남자좀비: 1
    - 여자좀비: 2
    - 와일드좀비: 4
2. 체력
    - 남자좀비: 10 
        - 스테이지가 3단계 이상일 시, 추가 체력 + 10
    - 여자좀비: 20
        - 스테이지가 4단계 이상일 시, 추가 체력 + 10
    - 와일드좀비: 30
        - 스테이지가 6단계 이상일 시, 추가 체력 + 20
3. 스피드
    - 남자좀비: 5
        - 2 ~ 5 사이 랜덤
    - 여자좀비: 7
        - 3 ~ 7 사이 랜덤
    - 와일드좀비: 10
        - 7 ~ 10 사이 랜덤
4. 위치값
    - x(오른쪽 하단) - 스피드 
    - y(오른쪽 하단 고정)
    - 이미지 간에 상하좌우 여백이 존재해야함 대략 100정도
    - 범위를 갖고 있어 좀비가 특정 범위 안에 들어오면 공격함
5. 점수
    - 라벨이 빨간색: 20점
    - 라벨이 흰색: 10점

## 업그레이드
구상중

## 화면
1. 싱글모드
2. 멀티모드
3. 설정
4. 명예의 전당
5. 나가기

## 설정
1. 해상도 사이즈 설정
    - 800x600
    - 1024x768
    - 1280x960
    - 1600x1200
2. 단어 추가하기
    - 단어를 radis에 insert하기
3. 사운드 설정
    - 추후 생각하기
4. 폰트 사이즈 설정
    - 추후 생각하기
5. 뒤로가기
6. 나가기

## mvc 패턴 사용
model: 좀비, 군인, 점수, 레벨, 타자속도
view: JFrame
controller

## 자료구조
1. arrayList를 사용하여 구현
2. radis를 사용하여 저장된 단어를 갖고옴 -> list 자료구조 사용


## 이미지 다운 경로
https://craftpix.net/

## 참고 블로그
https://binghedev.tistory.com/57


## 20241028
- fps 60으로 설정 기능 추가
- 플레이어들은 서로간의 상태 데이터를 udp로 보냄 (최대 플레이어는 2명으로 제한)
    - 1. attack
        - 플레이어끼리 attack을 실행하면, zombie의 상태, solider의 상태를 brodcast로 보내야함
    - 2. 좀비에게 공격을 당하고 있을 경우 
        - 두 플레이어 전부 공격을 당함? -> zombie의 상태, solider의 상태를 brodcast로 보내야함



참고: https://www.youtube.com/watch?v=7mlLlRjFDK8&list=PLiHSiO7e0JtCtLrl-erg7MYuzRBX2VuZd&index=16

