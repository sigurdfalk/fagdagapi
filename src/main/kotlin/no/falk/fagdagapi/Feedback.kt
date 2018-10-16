package no.falk.fagdagapi

import org.springframework.data.annotation.Id

data class Feedback(@field:Id val id: String?, val text: String)