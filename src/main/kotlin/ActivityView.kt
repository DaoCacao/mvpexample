import contract.Presenter
import contract.View
import pseudo_android.BaseActivity
import pseudo_android.Button
import pseudo_android.EditText
import pseudo_android.Text

// Реализация интерфейса View с использованием псевдо Android.
// Без интерфейса presenter имел бы доступ ко всем методам BaseActivity, и мы никак не могли бы этого избежать, тк в андроиде Activity - это не наш клас, а системный
class ActivityView : BaseActivity(), View {
    lateinit var presenter: Presenter

    // сделали private потому что в тестах нам они не нужны (о тестах позже)
    private lateinit var editFirstNumber: EditText
    private lateinit var editSecondNumber: EditText
    private lateinit var buttonCalculate: Button
    private lateinit var textResult: Text

    // метод BaseActivity, который вызывается при создании активити
    override fun onCreate() {
        super.onCreate()
        addContentView()

        editFirstNumber = findViewById(EditText())
        editFirstNumber.onTextChanged = {
            presenter.onFirstNumberChanged(it.toIntOrNull() ?: 0)
        }

        editSecondNumber = findViewById(EditText())
        editSecondNumber.onTextChanged = {
            presenter.onSecondNumberChanged(it.toIntOrNull() ?: 0)
        }

        buttonCalculate = findViewById(Button())
        buttonCalculate.onClick = {
            presenter.onCalculateClicked()
        }

        textResult = findViewById(Text())
    }

    override fun showResult(result: String) {
        textResult.text = result
    }
}