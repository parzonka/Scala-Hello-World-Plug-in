package scala_hello_world_plugin.actions

import org.eclipse.jface.action.IAction
import org.eclipse.jface.viewers.ISelection
import org.eclipse.ui.IWorkbenchWindow
import org.eclipse.ui.IWorkbenchWindowActionDelegate
import org.eclipse.jface.dialogs.MessageDialog

/**
 * Our sample action implements workbench action delegate.
 * The action proxy will be created by the workbench and
 * shown in the UI. When the user tries to use the action,
 * this delegate will be created and execution will be
 * delegated to it.
 * @see IWorkbenchWindowActionDelegate
 */
class SampleAction extends IWorkbenchWindowActionDelegate {
  private var window: IWorkbenchWindow = _

  /**
   * The action has been activated. The argument of the
   * method represents the 'real' action sitting
   * in the workbench UI.
   * @see IWorkbenchWindowActionDelegate#run
   */
  def run(action: IAction) {
    MessageDialog.openInformation(
      window.getShell(),
      "Scala-Hello-World-Plugin",
      "Hello from Scala, Eclipse world!");
  }

  /**
   * Selection in the workbench has been changed. We
   * can change the state of the 'real' action here
   * if we want, but this can only happen after
   * the delegate has been created.
   * @see IWorkbenchWindowActionDelegate#selectionChanged
   */
  def selectionChanged(action: IAction, selection: ISelection) {
  }

  /**
   * We can use this method to dispose of any system
   * resources we previously allocated.
   * @see IWorkbenchWindowActionDelegate#dispose
   */
  def dispose() {
  }

  /**
   * We will cache window object in order to
   * be able to provide parent shell for the message dialog.
   * @see IWorkbenchWindowActionDelegate#init
   */
  def init(window: IWorkbenchWindow) {
    this.window = window
  }
}