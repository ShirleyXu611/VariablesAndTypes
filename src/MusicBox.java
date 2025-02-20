
public class MusicBox {

    // Variables
    private String songID;
    private char isSongPremium;
    public String songTitle;
    private String songArtists;
    private String songAlbum;
    public String songGenre;
    private String songProducer;
    public String songMusicLabel;
    public int noAds;

    //Constructor
    public MusicBox(String songID, char premiumSong, String title, String artists, String Album, String genre, String producer, String label) {
        this.songID = songID;
        this.isSongPremium = premiumSong;
        this.songArtists = artists;
        this.songTitle=title;
        this.songAlbum=Album;
        this.songGenre=genre;
        this.songProducer=producer;
        this.songMusicLabel=label;
        
        /* Initialise  the rest of the variables in this Constructor block*/
    }
    
    
    //Methods
    public String getSongID() {
        return songID;
    }

    public String getSongArtists() {
        return songArtists;
    }

    public char getPremiumSong() {
        return isSongPremium;
    }

    public String getSongTitle(){
        return songTitle;
    }

    public String getSongAlbum(){
        return songAlbum;
    }

    public String getSongGenre(){
        return songGenre;
    }
    public String getSongProducer(){
        return songProducer;
    }
    public String getSongMusicLabel(){
        return songProducer;
    }
    // -- TODO
        /* Create the rest of "getters" for the remaining variables */
    
        /* The following method is complete. You don't have to do anything here. Just try to understand it. */
        public void playSong(String songID, char premium, int ads) {
            switch(premium){
                case 'Y':
                System.out.println("This is a premium song. Please buy it to play without the ads");
                playAd(ads, premium);
                break;
                case 'N':
                System.out.println("Thank you for choosing this song. Hope you enjoy listening to it.");
                playAd(ads, premium);
                break;
            }
        }


        /* The following method is complete. You don't have to do anything here. Just try to understand it. */
        private void playAd(int ads, char premium) {
            if (ads == 1) {
                System.out.println("Playing Ad 1");
            }
            else {
                for(int i=1; i<=ads; i++){
                    System.out.println("Playing Ad " + i);
                }
            }
            
        }
    
}

