package Steps;


import jdk.nashorn.internal.ir.IfNode;
import junit.framework.Assert;

public class Steps extends base {
    String genre;
    public void clickGenre() throws InterruptedException {
        waitForScreen();
        click(homeScreen.txtGenre);
    }

    public void navigateGenre(String genre){
        this.genre = genre;
        switch (genre){
            case "Rock":
                click(genreScreen.rock);
                break;
            case "Cinematic":
                click(genreScreen.Cinematic);
                break;
            case "Jazz & Blues":
                click(genreScreen.Jazz);
                break;
            default:
                Assert.assertTrue("Oops! Genre name \"" +genre+"\" not found!", genre.matches(
                        "Rock|Cinematic|Jazz & Blues"));



        }
    }

    public void navigateMusic(String music){
        System.out.println(this.genre);
        if (this.genre.equalsIgnoreCase("Rock")){
        switch (music){
            case "Wish You'd Come True":
                click(musicScreen.Wish);
                break;
            case "Home":
                click(musicScreen.Home);
                break;
            case "Hey Sailor":
                click(musicScreen.HeySailor);
                break;
            case "Motocross":
                click(musicScreen.Motocross);
                break;
            case "Keys To The Kingdom":
                click(musicScreen.Keys);
                break;
            case "Drop and Roll":
                click(musicScreen.Drop);
                break;
            case "Tell the Angels":
                click(musicScreen.Tell);
                break;
            case "Awakening":
                click(musicScreen.Awakening);
                break;
            case "The coldest Shoulder":
                click(musicScreen.TheColdest);
                break;
            default:
                Assert.assertTrue("Oops! Music name  \""+music+"\" not found under the "+this.genre+" genre!", music.matches(
                        "Wish You'd Come True|Home|Hey Sailor|Motocross|Keys To The Kingdom|Drop and Roll|Tell the Angels|Awakening|The coldest Shoulder"));


        }}else if (this.genre.equalsIgnoreCase("Cinematic")){
        switch (music){
            case "The Story Unfolds":
                click(musicScreen.TheStory);
                break;
            case "On the Bach":
                click(musicScreen.OnBach);
                break;
            default:
                Assert.assertTrue("Oops! Music name \""+music+"\" not found under the "+this.genre+" genre!", music.matches(
                        "The Story Unfolds|On the Bach"));


        }


        }else if(this.genre.equalsIgnoreCase("Jazz & Blues")){
        switch (music){
            case "Jazz in Paris":
                click(musicScreen.Jazz);
                break;
            case "Talkies":
                click(musicScreen.Talkies);
                break;
            case "The Messenger":
                click(musicScreen.TheMessenger);
                break;
            default:
                Assert.assertTrue("Oops! Music name  \""+music+"\" not found under the "+this.genre+" genre!", music.matches(
                        "Jazz in Paris|Talkies|The Messenger"));

        }
        }
    }

    public void validateSong(){
        isDisplayed(musicScreen.SongPlaying);
    }
}
