package com.kodilla.patterns.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskTestSuite {

    @Test
    void testObserver() {
        //Given
        Mentor andrzejJaromin = new Mentor("Andrzej Jaromin");
        Mentor szymonGasienica = new Mentor("Szymon Gasienica Kotelnicki");
        Task patrykKrzyzak = new StudentPatrykKrzyzak();
        Task janNowak = new StudentJanNowak();
        Task adrianMartin = new StudentAdrianMartin();
        Task kamilKocon = new StudentKamilKocon();
        patrykKrzyzak.assignMentor(andrzejJaromin);
        janNowak.assignMentor(andrzejJaromin);
        adrianMartin.assignMentor(szymonGasienica);
        kamilKocon.assignMentor(szymonGasienica);

        //When
        patrykKrzyzak.addTask("Aspect Oriented Programming Task");
        patrykKrzyzak.addTask("Observer Task");
        patrykKrzyzak.addTask("Facade Task");
        janNowak.addTask("Object Oriented Programming Task");
        janNowak.addTask("Inheritance Task");
        janNowak.addTask("Loops Task");
        adrianMartin.addTask("Collections Task");
        adrianMartin.addTask("Special Additional Task");
        kamilKocon.addTask("Concatenation Task");
        kamilKocon.addTask("Tic-Tac-Toe Task");

        int andrzejJarominCount = (patrykKrzyzak.getTasks().size()) + (janNowak.getTasks().size());
        int szymonGasienicaCount = (adrianMartin.getTasks().size()) + (kamilKocon.getTasks().size());

        //Then
        assertEquals(6, andrzejJarominCount);
        assertEquals(4, szymonGasienicaCount);

    }
}
