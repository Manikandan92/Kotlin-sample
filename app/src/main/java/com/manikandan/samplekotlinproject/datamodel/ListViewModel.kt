package com.manikandan.sample_kotlin.datamodel

/**
 * Created by manikandan on 05/03/18.
 */
class ListViewModel {
    var id: Int? = null
    var title: String? = null
    var content: String? = null

    constructor(id: Int, title: String, content: String) {
        this.id = id
        this.title = title
        this.content = content
    }
}