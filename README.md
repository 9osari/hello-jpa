# JPA 기본편 학습 프로젝트

김영한님의 **자바 ORM 표준 JPA 프로그래밍 - 기본편** 강의를 수강하며 작성한 실습 코드입니다.

## 프로젝트 소개

순수 JPA(Spring Boot 없이)를 사용하여 JPA의 내부 동작 방식과 객체-관계 매핑의 기초를 학습합니다.

### 학습 목표
- JPA의 내부 동작 원리 이해
- 영속성 컨텍스트와 트랜잭션 개념 습득
- 엔티티 간 연관관계 매핑 실습
- 객체와 DB 테이블을 올바르게 설계하고 매핑하는 방법 학습

## 기술 스택

- **Java**: 21
- **JPA/Hibernate**: 6.4.2.Final
- **Database**: H2 2.2.224
- **Build Tool**: Maven


## 주요 학습 개념

- 영속성 컨텍스트: 엔티티를 영구 저장하는 환경
- 엔티티 생명주기: 비영속, 영속, 준영속, 삭제
- 지연 로딩과 즉시 로딩: 연관관계 엔티티 로딩 전략
- 연관관계 매핑: @ManyToOne, @OneToMany, @OneToOne, @ManyToMany


## 참고자료
- [자바 ORM 표준 JPA 프로그래밍 - 기본편](https://www.inflearn.com/course/ORM-JPA-Basic)   
- 김영한님 저서: 자바 ORM 표준 JPA 프로그래밍
