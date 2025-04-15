## ✈️ Planner API

Planner is a **travel planning API** that helps you organize and plan your trips. You can select dates and destinations, and share your plans with friends to collaborate on the trip details.

### 🚀 Features

- **Create and Edit a Trip**: Easily set up a new trip or modify the existing trip details.
- **Invite Guests**: Invite friends via email to collaborate on planning.
- **Add Activities**: Add and organize activities for the trip.

### 🗂 Domain Class Diagram

```mermaid
classDiagram
    class Trip {
        +UUID id
        +String destination
        +Timestamp startsAt
        +Timestamp endsAt
        +Boolean isConfirmed
        +String ownerName
        +String ownerEmail
    }

    class Participant {
        +UUID id
        +String name
        +String email
        +Boolean isConfirmed
        +UUID tripId
    }

    class Activity {
        +UUID id
        +String title
        +Timestamp occursAt
        +UUID tripId
    }

    Trip "1" --> "0..*" Participant : has
    Trip "1" --> "0..*" Activity : includes
```

---

This project was developed during the Decola Tech Bootcamp - Avanade.
