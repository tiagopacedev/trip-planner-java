package com.trip_planner.trip_planner.participants;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

@Service
public class ParticipantService {

    public void registerParticipantsToEvent(List<String> participantsToInvite, UUID tripId) {
    };

    public void triggerConfirmationEmailToParticipants(UUID tripId) {
    };
}