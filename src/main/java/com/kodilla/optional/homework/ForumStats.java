package com.kodilla.optional.homework;

import com.kodilla.stream.UsersRepository;

public class ForumStats {
    public static void main(String[] args) {
        double frs = UsersRepository.getUsersList()

                .stream()
                .map(u->u.getNumberOfPost())
                .mapToInt(N->N)
                .average()
                .getAsDouble();
        System.out.println(frs);
    }
}
