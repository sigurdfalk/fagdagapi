package no.falk.fagdagapi

import org.springframework.data.mongodb.repository.MongoRepository

interface FeedbackRepository : MongoRepository<Feedback, String>