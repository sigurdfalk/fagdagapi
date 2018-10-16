package no.falk.fagdagapi

import org.springframework.data.annotation.Id

data class Feedback(@field:Id val id: String?, var appName: String?, val feedbackText: String)