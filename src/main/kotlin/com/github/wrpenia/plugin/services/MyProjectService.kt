package com.github.wrpenia.plugin.services

import com.intellij.openapi.project.Project
import com.github.wrpenia.plugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
