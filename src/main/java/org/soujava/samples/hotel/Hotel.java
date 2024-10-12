package org.soujava.samples.hotel;

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
    Optional<Guest> findByNumber(int number);
}
