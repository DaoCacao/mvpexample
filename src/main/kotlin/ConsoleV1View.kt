import contract.Presenter
import contract.View

// Реализация интерфейса View с использованием консоли, которая построчно запрашивает два числа
class ConsoleV1View : View {
    lateinit var presenter: Presenter

    // Уникальный для этой реализации метод, который запрашивает ввод с консоли. Он не виден через интерфейс и презентер его не может использовать, зато его может использовать main
    fun start() {
        while (true) {
            println("Введите первое число")
            val firstNumber = readlnOrNull()?.toIntOrNull()
            if (firstNumber != null) {
                presenter.onFirstNumberChanged(firstNumber)
            } else {
                println("Неверный формат числа, перезапуск...")
                continue
            }

            println("Введите второе число")
            val secondNumber = readlnOrNull()?.toIntOrNull()
            if (secondNumber != null) {
                presenter.onSecondNumberChanged(secondNumber)
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