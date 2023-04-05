import contract.Presenter
import contract.View

// Реализация интерфейса Presenter
class PresenterImpl : Presenter {
    // Поля public для того, чтобы были доступны в тестах (о них позже).
    // Без интерфейса мы можем вызвать поля из view, что не хорошо, либо нам нужно делать поля private, что усложнило бы тесты
    lateinit var view: View
    var firstNumber: Int = 0
    var secondNumber: Int = 0

    override fun onFirstNumberChanged(firstNumber: Int) {
        this.firstNumber = firstNumber
    }

    override fun onSecondNumberChanged(secondNumber: Int) {
        this.secondNumber = secondNumber
    }

    override fun onCalculateClicked() {
        val result = firstNumber + secondNumber
        view.showResult(result.toString())
    }
}