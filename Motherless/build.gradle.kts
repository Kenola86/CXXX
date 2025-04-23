version = 2

cloudstream {
    authors     = listOf("Coxju, megix")
    language    = "en"
    description = "Motherless is the best"

    /**
     * Status int as the following:
     * 0: Down
     * 1: Ok
     * 2: Slow
     * 3: Beta only
    **/
    status  = 1 // will be 3 if unspecified
    tvTypes = listOf("NSFW")
    iconUrl = "https://www.google.com/s2/favicons?domain=motherless.com&sz=%size%"
}
