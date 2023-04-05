package contract

// Интерфейс Presenter. Описывает то, что может делать Presenter
interface Presenter {
    fun onFirstNumberChanged(firstNumber: Int)
    fun onSecondNumberChanged(secondNumber: Int)
    fun onCalculateClicked()
}