package pseudo_android

// Типо кнопка из андроида. Имеет свойство onClick, которое вызывается при нажатии на кнопку
class Button : UiView() {
    var onClick: () -> Unit = {}
}