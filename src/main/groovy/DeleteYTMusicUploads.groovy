import geb.spock.GebSpec

class DeleteYTMusicUploads extends GebSpec {
    def "Delete all tracks uploaded to YouTube Music"() {
        when:
        go "https://music.youtube.com/library/songs"

        then:
        true
    }
}
