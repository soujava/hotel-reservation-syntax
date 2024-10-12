package org.soujava.samples.hotel;

import jakarta.data.repository.By;
import jakarta.data.repository.Delete;
import jakarta.data.repository.Find;
import jakarta.data.repository.Repository;
import jakarta.data.repository.Save;

import java.util.Optional;

@Repository
public interface Hotel {

    @Save
    Guest checkIn(Guest guest);

    @Delete
    void checkOut(Guest guest);

    @Find
    Optional<Guest> reservation(@By(org.soujava.samples.hotel._Room.NUMBER) int number);
}
