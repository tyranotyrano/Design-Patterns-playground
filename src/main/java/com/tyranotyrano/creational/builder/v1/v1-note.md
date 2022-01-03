## 장점
    - 원하는 Builder 구현체를 이용하여 쉽고 빠르게 Product 를 생성 할 수 있다.
    - 생성되는 Product 용 객체는 불변상태를 유지할 수 있다.
## 단점
    - Concrete Builder 가 Product Class 의 모든 필드를 가지고 있어야 한다.
    - Product 의 필드에 자유롭게 값을 넣을 수 없고, 필요한 Builder 를 구현해야한다.