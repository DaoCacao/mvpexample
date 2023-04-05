// Пример реализации паттерна MVP на примере приложения которое считает сумму двух чисел.

// Одна точка входа, одна и та же программа, один презентер, но разные варианты view.
// Тем не менее - общий контракт, благодаря которому мы можем менять view, не меняя при этом presenter
fun main() {
    consoleV1Variant()
//    consoleV2Variant()
//    activityVariant()
}

// 1 Вариант, где пользователь работает через консоль
private fun consoleV1Variant() {
    // Создаем экземпляры реализаций, view другая, presenter тот же
    val view = ConsoleV1View()
    val presenter = PresenterImpl()

    // Здесь мы работаем с реализациями, по этому поля presenter и view доступны извне
    view.presenter = presenter
    presenter.view = view
    view.start()
}

// 2 Вариант, где пользователь работает через консоль
private fun consoleV2Variant() {
    // Создаем экземпляры реализаций, view другая, presenter тот же
    val view = ConsoleV2View()
    val presenter = PresenterImpl()

    // Здесь мы работаем с реализациями, по этому поля presenter и view доступны извне
    view.presenter = presenter
    presenter.view = view
    view.start()
}

// 3 Вариант, где пользователь работает через псевдо Android (в консоли работать не будет, тк нет вьюшек)
private fun androidVariant() {
    // Создаем экземпляры реализаций, view другая, presenter тот же
    val view = ActivityView()
    val presenter = PresenterImpl()

    // Здесь мы работаем с реализациями, по этому поля presenter и view доступны извне
    view.presenter = presenter
    presenter.view = view
    view.onCreate()
}