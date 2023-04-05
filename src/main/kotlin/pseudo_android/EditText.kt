package pseudo_android

// Типо поле ввода. Имеет свойство onTextChanged, которое вызывается при изменении текста в поле
class EditText : UiView() {
    var onTextChanged: (String) -> Unit = {}
}