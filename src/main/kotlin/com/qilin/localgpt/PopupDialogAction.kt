package com.qilin.localgpt

import com.intellij.openapi.actionSystem.ActionUpdateThread
import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent

// extent AnAction
class PopupDialogAction : AnAction() {
    override fun actionPerformed(e: AnActionEvent) {
//        val project = e.project ?: return
//        val dialog = PopupDialog(project)
//        dialog.show()
    }

    override fun update(e: AnActionEvent) {
//        super.update(e)
    }

    override fun getActionUpdateThread(): ActionUpdateThread {
        return super.getActionUpdateThread()
    }
}