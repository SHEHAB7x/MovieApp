package com.example.moviesapp.data.models;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.List;

public class MovieModel {

    /**
     * page : 2
     * results : [{"adult":false,"backdrop_path":"/8KJMOKyl9rpgb9ELEwhfBMIaTHw.jpg","genre_ids":[10751,16,14,35],"id":1139087,"original_language":"en","original_title":"Once Upon a Studio","overview":"Created for Disney's 100th anniversary, the short sees Mickey Mouse corralling a gallery of legendary Disney characters for a group photo.","popularity":616.02,"poster_path":"/hr8ZtwdbtjBquxlTCrczr685K5T.jpg","release_date":"2023-09-24","title":"Once Upon a Studio","video":false,"vote_average":8.8,"vote_count":141},{"adult":false,"backdrop_path":"/eSsMzJpzAwCa69tm6Wco2il44aJ.jpg","genre_ids":[28,80,18,53],"id":939335,"original_language":"en","original_title":"Muzzle","overview":"LAPD K-9 officer Jake Rosser has just witnessed the shocking murder of his dedicated partner by a mysterious assailant. As he investigates the shooter\u2019s identity, he uncovers a vast conspiracy that has a chokehold on the city in this thrilling journey through the tangled streets of Los Angeles and the corrupt bureaucracy of the LAPD.","popularity":589.04,"poster_path":"/qXChf7MFL36BgoLkiB3BzXiwW82.jpg","release_date":"2023-09-29","title":"Muzzle","video":false,"vote_average":6.2,"vote_count":42},{"adult":false,"backdrop_path":"/xHqTnPtpd9Qd7R0fVtoqxZYM67Q.jpg","genre_ids":[80,53,28],"id":958006,"original_language":"en","original_title":"The Kill Room","overview":"A hitman, his boss, an art dealer and a money-laundering scheme that accidentally turns the assassin into an overnight avant-garde sensation, one that forces her to play the art world against the underworld.","popularity":551.388,"poster_path":"/qKpdy7N6zX05eisopvvviiTwPxb.jpg","release_date":"2023-09-14","title":"The Kill Room","video":false,"vote_average":6,"vote_count":30},{"adult":false,"backdrop_path":"/iIvQnZyzgx9TkbrOgcXx0p7aLiq.jpg","genre_ids":[27,53],"id":1008042,"original_language":"en","original_title":"Talk to Me","overview":"When a group of friends discover how to conjure spirits using an embalmed hand, they become hooked on the new thrill, until one of them goes too far and unleashes terrifying supernatural forces.","popularity":541.512,"poster_path":"/kdPMUMJzyYAc4roD52qavX0nLIC.jpg","release_date":"2023-07-26","title":"Talk to Me","video":false,"vote_average":7.2,"vote_count":1561},{"adult":false,"backdrop_path":"/2vFuG6bWGyQUzYS9d69E5l85nIz.jpg","genre_ids":[28,12,878],"id":667538,"original_language":"en","original_title":"Transformers: Rise of the Beasts","overview":"When a new threat capable of destroying the entire planet emerges, Optimus Prime and the Autobots must team up with a powerful faction known as the Maximals. With the fate of humanity hanging in the balance, humans Noah and Elena will do whatever it takes to help the Transformers as they engage in the ultimate battle to save Earth.","popularity":535.917,"poster_path":"/gPbM0MK8CP8A174rmUwGsADNYKD.jpg","release_date":"2023-06-06","title":"Transformers: Rise of the Beasts","video":false,"vote_average":7.5,"vote_count":3448},{"adult":false,"backdrop_path":"/ctMserH8g2SeOAnCw5gFjdQF8mo.jpg","genre_ids":[35,12,14],"id":346698,"original_language":"en","original_title":"Barbie","overview":"Barbie and Ken are having the time of their lives in the colorful and seemingly perfect world of Barbie Land. However, when they get a chance to go to the real world, they soon discover the joys and perils of living among humans.","popularity":519.612,"poster_path":"/iuFNMS8U5cb6xfzi51Dbkovj7vM.jpg","release_date":"2023-07-19","title":"Barbie","video":false,"vote_average":7.2,"vote_count":5593},{"adult":false,"backdrop_path":"/bQTfSXQrcVwXJ5TvNzbd3ioMnnM.jpg","genre_ids":[9648,53,28,18],"id":862552,"original_language":"en","original_title":"The Ritual Killer","overview":"Unable to process the death of his daughter, Detective Boyd embarks on a hunt for a serial killer who murders according to a brutal tribal ritual: Muti. The only person who can help Boyd is Professor Mackles, an anthropologist who hides an unspeakable secret. The line between sanity and madness thins as Boyd goes deeper into the killer\u2019s world.","popularity":507.289,"poster_path":"/1VtHaELqLMovl8EueBWHDtihhzF.jpg","release_date":"2023-03-09","title":"The Ritual Killer","video":false,"vote_average":5.9,"vote_count":155},{"adult":false,"backdrop_path":"/iiXliCeykkzmJ0Eg9RYJ7F2CWSz.jpg","genre_ids":[28,53,80],"id":762430,"original_language":"en","original_title":"Retribution","overview":"When a mysterious caller puts a bomb under his car seat, Matt Turner begins a high-speed chase across the city to complete a specific series of tasks. With his kids trapped in the back seat and a bomb that will explode if they get out of the car, a normal commute becomes a twisted game of life or death as Matt follows the stranger's increasingly dangerous instructions in a race against time to save his family.","popularity":490.901,"poster_path":"/oUmmY7QWWn7OhKlcPOnirHJpP1F.jpg","release_date":"2023-08-23","title":"Retribution","video":false,"vote_average":7,"vote_count":501},{"adult":false,"backdrop_path":"/4fLZUr1e65hKPPVw0R3PmKFKxj1.jpg","genre_ids":[16,35,10751,14,10749],"id":976573,"original_language":"en","original_title":"Elemental","overview":"In a city where fire, water, land and air residents live together, a fiery young woman and a go-with-the-flow guy will discover something elemental: how much they have in common.","popularity":482.092,"poster_path":"/4Y1WNkd88JXmGfhtWR7dmDAo1T2.jpg","release_date":"2023-06-14","title":"Elemental","video":false,"vote_average":7.7,"vote_count":2760},{"adult":false,"backdrop_path":"/k38uEFijy5ONeCc5vWAGoyxBvD2.jpg","genre_ids":[878,9648,53,28],"id":1067820,"original_language":"es","original_title":"Awareness","overview":"Ian is a teenager who lives with his father on the outskirts by running small scams using Ian's ability to generate visual illusions upon unsuspecting victims. When one of his cons goes awry, his abilities publicly spiral out of control and Ian becomes the target of two rival organizations, each seeking to exploit his powers.","popularity":474.41,"poster_path":"/nXj3iwqUTnVWR95KCkjGT6hle0J.jpg","release_date":"2023-03-16","title":"Awareness","video":false,"vote_average":5.8,"vote_count":70},{"adult":false,"backdrop_path":"/jkKVLzLWjSvTnc84VzeljhSy6j8.jpg","genre_ids":[10749,18],"id":820525,"original_language":"en","original_title":"After Everything","overview":"Besieged by writer\u2019s block and the crushing breakup with Tessa, Hardin travels to Portugal in search of a woman he wronged in the past \u2013 and to find himself. Hoping to win back Tessa, he realizes he needs to change his ways before he can make the ultimate commitment.","popularity":468.98,"poster_path":"/uQxjZGU6rxSPSMeAJPJQlmfV3ys.jpg","release_date":"2023-09-13","title":"After Everything","video":false,"vote_average":6.9,"vote_count":382},{"adult":false,"backdrop_path":"/35z8hWuzfFUZQaYog8E9LsXW3iI.jpg","genre_ids":[12,28],"id":335977,"original_language":"en","original_title":"Indiana Jones and the Dial of Destiny","overview":"Finding himself in a new era, and approaching retirement, Indy wrestles with fitting into a world that seems to have outgrown him. But as the tentacles of an all-too-familiar evil return in the form of an old rival, Indy must don his hat and pick up his whip once more to make sure an ancient and powerful artifact doesn't fall into the wrong hands.","popularity":455.23,"poster_path":"/Af4bXE63pVsb2FtbW8uYIyPBadD.jpg","release_date":"2023-06-28","title":"Indiana Jones and the Dial of Destiny","video":false,"vote_average":6.7,"vote_count":1951},{"adult":false,"backdrop_path":"/4HodYYKEIsGOdinkGi2Ucz6X9i0.jpg","genre_ids":[16,28,12],"id":569094,"original_language":"en","original_title":"Spider-Man: Across the Spider-Verse","overview":"After reuniting with Gwen Stacy, Brooklyn\u2019s full-time, friendly neighborhood Spider-Man is catapulted across the Multiverse, where he encounters the Spider Society, a team of Spider-People charged with protecting the Multiverse\u2019s very existence. But when the heroes clash on how to handle a new threat, Miles finds himself pitted against the other Spiders and must set out on his own to save those he loves most.","popularity":443.729,"poster_path":"/8Vt6mWEReuy4Of61Lnj5Xj704m8.jpg","release_date":"2023-05-31","title":"Spider-Man: Across the Spider-Verse","video":false,"vote_average":8.4,"vote_count":4654},{"adult":false,"backdrop_path":"/2fAnbhiwqPiu0XHA98nZrPckPgv.jpg","genre_ids":[27,14,53],"id":675531,"original_language":"en","original_title":"Dark Harvest","overview":"In a cursed town, the annual harvest becomes a brutal battle for survival. On Halloween 1963, Sawtooth Jack, a terrifying legend, rises from the cornfields, threatening the town\u2019s children. Groups of boys unite to defeat the murderous scarecrow before midnight. Richie, a rebellious outcast, joins the run, motivated by his brother\u2019s previous victory. As the hunt progresses, Richie makes a shocking discovery and faces a pivotal choice to break the relentless cycle.","popularity":443.279,"poster_path":"/sFBDjWdw8gHSI2dMivP7H52iwvp.jpg","release_date":"2023-10-11","title":"Dark Harvest","video":false,"vote_average":5.8,"vote_count":71},{"adult":false,"backdrop_path":"/uvsL5Q5Juf8ivqBnlr4nFVUwVoa.jpg","genre_ids":[80,18,53],"id":466420,"original_language":"en","original_title":"Killers of the Flower Moon","overview":"When oil is discovered in 1920s Oklahoma under Osage Nation land, the Osage people are murdered one by one\u2014until the FBI steps in to unravel the mystery.","popularity":442.41,"poster_path":"/dB6Krk806zeqd0YNp2ngQ9zXteH.jpg","release_date":"2023-10-18","title":"Killers of the Flower Moon","video":false,"vote_average":7.9,"vote_count":407},{"adult":false,"backdrop_path":"/ihZtk1FxpfqkdMoxYYjLVj2FXtV.jpg","genre_ids":[18,28,10752],"id":517093,"original_language":"ru","original_title":"Балканский рубеж","overview":"After the NATO bombing of Yugoslavia in 1999, the Yugoslav army pulls out of Kosovo region, leaving Serbian people at the mercy of the Albanian UCK. A small band of soldiers must take over the Slatina airport, and hold it until the Russian peacekeepers arrive.","popularity":435.393,"poster_path":"/okiB4NUriKKbGjAtVSzveicPTtu.jpg","release_date":"2019-03-21","title":"Balkan Line","video":false,"vote_average":7.6,"vote_count":346},{"adult":false,"backdrop_path":"/askg3SMvhqEl4OL52YuvdtY40Yb.jpg","genre_ids":[10751,16,14,10402,35,12],"id":354912,"original_language":"en","original_title":"Coco","overview":"Despite his family\u2019s baffling generations-old ban on music, Miguel dreams of becoming an accomplished musician like his idol, Ernesto de la Cruz. Desperate to prove his talent, Miguel finds himself in the stunning and colorful Land of the Dead following a mysterious chain of events. Along the way, he meets charming trickster Hector, and together, they set off on an extraordinary journey to unlock the real story behind Miguel's family history.","popularity":408.25,"poster_path":"/gGEsBPAijhVUFoiNpgZXqRVWJt2.jpg","release_date":"2017-10-27","title":"Coco","video":false,"vote_average":8.2,"vote_count":17889},{"adult":false,"backdrop_path":"/xwsLbyCXeaCmSde4PDsRPWufdGy.jpg","genre_ids":[37,28,53],"id":884315,"original_language":"en","original_title":"Terror on the Prairie","overview":"A pioneering family fights back against a gang of vicious outlaws that is terrorizing them on their newly-built farm on the plains of Montana.","popularity":402.311,"poster_path":"/xfwHIY865AYJoFgBAYoAJLvPLO9.jpg","release_date":"2022-09-08","title":"Terror on the Prairie","video":false,"vote_average":6.2,"vote_count":43},{"adult":false,"backdrop_path":"/te0Rdpo7dQYPiR3S0OAMBrqdzy4.jpg","genre_ids":[16,28,14,12],"id":1150537,"original_language":"en","original_title":"Justice League x RWBY: Super Heroes & Huntsmen, Part Two","overview":"On the heels of successfully escaping a deadly digital trap, the members of the Justice League emerge in their own world to discover that Grimm, ravenous creatures from Remnant, have overtaken Earth! In order to defeat the monsters, they must call on their new friends \u2013 Team RWBY \u2013 for help!","popularity":402.061,"poster_path":"/oopH7qWS4Z2HqHCbn9gsVwV3RQW.jpg","release_date":"2023-10-17","title":"Justice League x RWBY: Super Heroes & Huntsmen, Part Two","video":false,"vote_average":8.3,"vote_count":5},{"adult":false,"backdrop_path":"/yF1eOkaYvwiORauRCPWznV9xVvi.jpg","genre_ids":[28,12,878],"id":298618,"original_language":"en","original_title":"The Flash","overview":"When his attempt to save his family inadvertently alters the future, Barry Allen becomes trapped in a reality in which General Zod has returned and there are no Super Heroes to turn to. In order to save the world that he is in and return to the future that he knows, Barry's only hope is to race for his life. But will making the ultimate sacrifice be enough to reset the universe?","popularity":393.37,"poster_path":"/rktDFPbfHfUbArZ6OOOKsXcv0Bm.jpg","release_date":"2023-06-13","title":"The Flash","video":false,"vote_average":6.9,"vote_count":3117}]
     * total_pages : 40713
     * total_results : 814255
     */

    private int page;
    private int total_pages;
    private int total_results;
    private List<ResultsBean> results;

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getTotal_pages() {
        return total_pages;
    }

    public void setTotal_pages(int total_pages) {
        this.total_pages = total_pages;
    }

    public int getTotal_results() {
        return total_results;
    }

    public void setTotal_results(int total_results) {
        this.total_results = total_results;
    }

    public List<ResultsBean> getResults() {
        return results;
    }

    public void setResults(List<ResultsBean> results) {
        this.results = results;
    }
    @Entity
    public static class ResultsBean {

        private boolean adult;
        private String backdrop_path;
        @PrimaryKey
        private int id;
        private String original_language;
        private String original_title;
        private String overview;
        private double popularity;
        private String poster_path;
        private String release_date;
        private String title;
        private boolean video;
        private double vote_average;
        private int vote_count;
        private List<Integer> genre_ids;

        public boolean isAdult() {
            return adult;
        }

        public void setAdult(boolean adult) {
            this.adult = adult;
        }

        public String getBackdrop_path() {
            return backdrop_path;
        }

        public void setBackdrop_path(String backdrop_path) {
            this.backdrop_path = backdrop_path;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getOriginal_language() {
            return original_language;
        }

        public void setOriginal_language(String original_language) {
            this.original_language = original_language;
        }

        public String getOriginal_title() {
            return original_title;
        }

        public void setOriginal_title(String original_title) {
            this.original_title = original_title;
        }

        public String getOverview() {
            return overview;
        }

        public void setOverview(String overview) {
            this.overview = overview;
        }

        public double getPopularity() {
            return popularity;
        }

        public void setPopularity(double popularity) {
            this.popularity = popularity;
        }

        public String getPoster_path() {
            return poster_path;
        }

        public void setPoster_path(String poster_path) {
            this.poster_path = poster_path;
        }

        public String getRelease_date() {
            return release_date;
        }

        public void setRelease_date(String release_date) {
            this.release_date = release_date;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public boolean isVideo() {
            return video;
        }

        public void setVideo(boolean video) {
            this.video = video;
        }

        public double getVote_average() {
            return vote_average;
        }

        public void setVote_average(double vote_average) {
            this.vote_average = vote_average;
        }

        public int getVote_count() {
            return vote_count;
        }

        public void setVote_count(int vote_count) {
            this.vote_count = vote_count;
        }

        public List<Integer> getGenre_ids() {
            return genre_ids;
        }

        public void setGenre_ids(List<Integer> genre_ids) {
            this.genre_ids = genre_ids;
        }
    }
}
