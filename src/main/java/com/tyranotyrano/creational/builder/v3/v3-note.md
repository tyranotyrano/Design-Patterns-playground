## 장점
    - Product 용 클래스 내부에 Builder 클래스를 작성하여, 외부에 별도의 Builder 가 필요없다.
        - Product 용 클래스에서 바로 Builder 패턴을 적용하여 간편하게 객체를 생성할 수 있다.
    - 필요에 따라 Product 용 클래스의 필수값을 Builder 클래스의 builder() 메서드로 바로 받아서 처리할 수 있다.
        - 필수값과 선택값을 구분하여 Product 용 객체를 생성할 수 있다.
    - Product 용 클래스에 Setter 메서드를 작성하지 않아도 필드에 값을 자유롭게 넣을 수 있다.
## 단점
    - 내부에 정의한 Builder 클래스가 Product 용 클래스의 모든 필드와 동일한 필드를 가지고 있어야한다.