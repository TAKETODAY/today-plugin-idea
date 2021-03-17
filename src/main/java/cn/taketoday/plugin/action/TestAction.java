package cn.taketoday.plugin.action;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.CommonDataKeys;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.Messages;
import com.intellij.pom.Navigatable;

import org.jetbrains.annotations.NotNull;

/**
 * @author TODAY 2021/3/16 14:22
 */
public class TestAction extends AnAction {

  public TestAction() {

  }

  @Override
  public void actionPerformed(@NotNull AnActionEvent event) {
    // Using the event, create and show a dialog
    Project currentProject = event.getProject();
    StringBuffer dlgMsg = new StringBuffer(event.getPresentation().getText() + " Selected!");
    String dlgTitle = event.getPresentation().getDescription();
    // If an element is selected in the editor, add info about it.
    Navigatable nav = event.getData(CommonDataKeys.NAVIGATABLE);
    if (nav != null) {
      dlgMsg.append(String.format("\nSelected Element: %s", nav.toString()));
    }
    Messages.showMessageDialog(currentProject, dlgMsg.toString(), dlgTitle, Messages.getInformationIcon());
  }
}
