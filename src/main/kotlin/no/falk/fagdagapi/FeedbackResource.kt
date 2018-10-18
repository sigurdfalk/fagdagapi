package no.falk.fagdagapi

import org.springframework.web.bind.annotation.*
import javax.servlet.http.HttpServletRequest

@RestController
@RequestMapping("/feedback")
class FeedbackResource(private val feedbackRepository: FeedbackRepository, private val httpServletRequest: HttpServletRequest) {

    @CrossOrigin(origins = ["http://localhost:*"])
    @GetMapping
    fun findAll(): List<Feedback> = feedbackRepository.findAll()

    @CrossOrigin(origins = ["http://localhost:*"])
    @PostMapping
    fun insert(@RequestBody feedback: Feedback) {
        val appName = httpServletRequest.getHeader("X-Klient-Navn")
        feedback.appName = appName

        feedbackRepository.insert(feedback)
    }
}