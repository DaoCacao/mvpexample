import contract.Presenter
import contract.View

// Реализация интерфейса View с использованием консоли, которая запрашивает два числа через пробел
class ConsoleV2View : View {
    lateinit var presenter: Presenter

    fun start() {
        while (true) {
            println("Введите два числа через пробел")
            val numbers = readlnOrNull()?.split(" ")?.map { it.toIntOrNull() }
            if (numbers != null && numbers.size == 2 && numbers[0] != null && numbers[1] != null) {
                presenter.onFirstNumberChanged(numbers[0]!!)
                presenter.onSecondNumberChanged(numbers[1]!!)
            } else {
                println("Неверный формат числа, перезапуск...")
                continue
            }

            println("Нажмите Enter для подсчета")
            readlnOrNull()
            presenter.onCalculateClicked()
        }
    }

    override fun showResult(result: String) {
        println("Результат: $result, перезапуск...")
    }
}