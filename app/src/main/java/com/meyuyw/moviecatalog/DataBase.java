package com.meyuyw.moviecatalog;

import java.util.ArrayList;

public class DataBase {
    static ArrayList<Movie> data = new ArrayList<>();
    static String[][] movies = {
            {"Captain Marvel", "The story follows Carol Danvers as she becomes one of the universe’s most powerful heroes when Earth is caught in the middle of a galactic war between two alien races. Set in the 1990s, Captain Marvel is an all-new adventure from a previously unseen period in the history of the Marvel Cinematic Universe.", "2h 4m", "March 8, 2019", String.valueOf(R.drawable.captainmarvel)},
            {"Guardians of the Galaxy", "Light years from Earth, 26 years after being abducted, Peter Quill finds himself the prime target of a manhunt after discovering an orb wanted by Ronan the Accuser.", "2h 1m", "August 1, 2014", String.valueOf(R.drawable.avenger)},
            {"Black Panther", "King T'Challa returns home from America to the reclusive, technologically advanced African nation of Wakanda to serve as his country's new leader. However, T'Challa soon finds that he is challenged for the throne by factions within his own country as well as without. Using powers reserved to Wakandan kings, T'Challa assumes the Black Panther mantel to join with girlfriend Nakia, the queen-mother, his princess-kid sister, members of the Dora Milaje (the Wakandan 'special forces') and an American secret agent, to prevent Wakanda from being dragged into a world war.", "2h 14m", "February 16, 2018", String.valueOf(R.drawable.phanter)},
            {"Robin Hood", "A war-hardened Crusader and his Moorish commander mount an audacious revolt against the corrupt English crown.", "1h 56m", "November 21, 2018", String.valueOf(R.drawable.hood)},
            {"Ralph Breaks the Internet", "Video game bad guy Ralph and fellow misfit Vanellope von Schweetz must risk it all by traveling to the World Wide Web in search of a replacement part to save Vanellope's video game, \"Sugar Rush.\" In way over their heads, Ralph and Vanellope rely on the citizens of the internet -- the netizens -- to help navigate their way, including an entrepreneur named Yesss, who is the head algorithm and the heart and soul of trend-making site BuzzzTube.", "1h 52m", "November 21, 2018", String.valueOf(R.drawable.ralph)},
            {"How to Train Your Dragon: The Hidden World", "As Hiccup fulfills his dream of creating a peaceful dragon utopia, Toothless’ discovery of an untamed, elusive mate draws the Night Fury away. When danger mounts at home and Hiccup’s reign as village chief is tested, both dragon and rider must make impossible decisions to save their kind.", "1h 44m", "February 22, 2019", String.valueOf(R.drawable.dragon)},
            {"Aquaman", "Once home to the most advanced civilization on Earth, Atlantis is now an underwater kingdom ruled by the power-hungry King Orm. With a vast army at his disposal, Orm plans to conquer the remaining oceanic people and then the surface world. Standing in his way is Arthur Curry, Orm's half-human, half-Atlantean brother and true heir to the throne.", "2h 24m", "December 21, 2018", String.valueOf(R.drawable.aquaman)},
            {"Avengers: Endgame", "After the devastating events of Avengers: Infinity War, the universe is in ruins due to the efforts of the Mad Titan, Thanos. With the help of remaining allies, the Avengers must assemble once more in order to undo Thanos' actions and restore order to the universe once and for all, no matter what consequences may be in store.", "3h 2m", "April 26, 2019", String.valueOf(R.drawable.endgame)},
            {"Cars", "Lightning McQueen, a hotshot rookie race car driven to succeed, discovers that life is about the journey, not the finish line, when he finds himself unexpectedly detoured in the sleepy Route 66 town of Radiator Springs. On route across the country to the big Piston Cup Championship in California to compete against two seasoned pros, McQueen gets to know the town's offbeat characters.", "1h 57m", "June 9, 2006", String.valueOf(R.drawable.cars)},
            {"The Hobbit: The Battle of the Five Armies", "Immediately after the events of The Desolation of Smaug, Bilbo and the dwarves try to defend Erebor's mountain of treasure from others who claim it: the men of the ruined Laketown and the elves of Mirkwood. Meanwhile an army of Orcs led by Azog the Defiler is marching on Erebor, fueled by the rise of the dark lord Sauron. Dwarves, elves and men must unite, and the hope for Middle-Earth falls into Bilbo's hands.", "2h 24m", "December 17, 2014", String.valueOf(R.drawable.hobbit)}
    };

    public static ArrayList<Movie> getData() {
            for (String[] var : movies) {
                Movie m = new Movie();
                m.setTitle(var[0]);
                m.setOverview(var[1]);
                m.setRuntime(var[2]);
                m.setRelease(var[3]);
                m.setPoster(Integer.valueOf(var[4]));
                data.add(m);
            }
            return data;

    }
}

/*
{"Beautiful World (literal title)","Park Moo-Jin (Park Hee-Soon) and Kang In-Ha (Choo Ja-Hyun) are a married couple. Park Moo-Jin works as a high school teacher and Kang In-Ha runs a bakery. They enjoy their lives with their children. Their peaceful days soon turn into a hellish experience. Their son, who is in the 3rd grade of middle school, is seriously injured due to school violence. Park Moo-Jin and Kang In-Ha try to reveal the truth. Meanwhile, Oh Jin-Pyo (Oh Man-Seok) and Seo Eun-Joo (Cho Yeo-Jeong) are a married couple. They are both from wealthy families. Oh Jin-Pyo is the chairman of a private school foundation inherited from his family. They have never experienced failure or lacked anything. They have a son who makes trouble. The parents coverup for their son's misbehavior.","Jumlah episode belum diketahui","April 5, 2019 - -",String.valueOf(R.drawable.beautifulworld)},
{"Because It's My First Love (literal title)","Five friends, who are all 20-years-old, leave their home for different reasons and begin to live together. The five friends are Tae-O (Ji Soo), Song-Yi (Jung Chae-Yeon), Do-Hyun (Jin Young), Ga-Rin (Choi Ri) and Hoon (Kang Tae-Oh).","8 Episode","April 18, 2019",String.valueOf(R.drawable.ghost)},*/
