## 장점
    - 추상 클래스 Builder 를 사용하므로, 내부에 Product 타입의 필드를 가질 수 있다.
    - 추상 클래스 Builder 를 사용하므로, 필요한 메서드(구체 메서드)를 추가할 수 있다.
    - Builder 추상 클래스에 Product 타입의 필드를 가지고 있어 간편하게 Product 인스턴스를 생성할 수 있다.
## 단점
    - Product 용 클래스에 Setter 메서드를 추가해야한다.
    - V1 과 마찬가지로 Product 의 필드에 자유롭게 값을 넣을 수 없고, 필요한 Builder 를 구현해야한다.