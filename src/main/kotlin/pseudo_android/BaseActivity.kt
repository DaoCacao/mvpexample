package pseudo_android

// Типо активити из андроида. Показывает экран, отрисовывает элементы и имеет еще около 20ти методов
open class BaseActivity {
    open fun onCreate() = Unit
    open fun onDestroy() = Unit
    open fun addContentView() = Unit
    open fun <V : UiView> findViewById(view: V) = view
    open fun finish() = Unit
    open fun getFragmentManager() = Unit
    open fun getParentActivityIntent() = Unit
    open fun onActivityResult() = Unit
    open fun onBackPressed() = Unit
    open fun onConfigurationChanged() = Unit
    open fun onKeyShortcut() = Unit
    open fun onPostCreate() = Unit
    open fun onRestoreInstanceState() = Unit
    open fun onSaveInstanceState() = Unit
    open fun overridePendingTransition() = Unit
    open fun onUserLeaveHint() = Unit
    open fun onWindowFocusChanged() = Unit
    open fun requestWindowFeature() = Unit
    open fun setContentView() = Unit
    open fun setFeatureDrawableResource() = Unit
    open fun setRequestedOrientation() = Unit
    open fun startActivity() = Unit
    open fun startActivityForResult() = Unit
    open fun setResult() = Unit
}