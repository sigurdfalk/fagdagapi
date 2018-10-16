package no.falk.fagdagapi

import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/feedback")
class FeedbackResource(private val feedbackRepository: FeedbackRepository) {

    @GetMapping
    fun ping() = "pong!"

    @PostMapping
    fun test(@RequestBody feedback: Feedback) = feedbackRepository.insert(feedback)
}