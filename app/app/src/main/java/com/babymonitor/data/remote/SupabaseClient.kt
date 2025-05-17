package com.babymonitor.data.remote

import io.github.jan.supabase.SupabaseClient
import io.github.jan.supabase.auth.Auth
import io.github.jan.supabase.createSupabaseClient
import io.github.jan.supabase.postgrest.Postgrest

object SupabaseClient {
    val supabase = createSupabaseClient(
        supabaseUrl = "https://oobwzjrhfbzktckniwgr.supabase.co",
        supabaseKey = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJzdXBhYmFzZSIsInJlZiI6Im9vYnd6anJoZmJ6a3Rja25pd2dyIiwicm9sZSI6ImFub24iLCJpYXQiOjE3NDc0OTQ4NDIsImV4cCI6MjA2MzA3MDg0Mn0.HINtvmgApbg1rotAZ_zAJfoXj1NPV6AvHd3Y2mE7TJg",
    ) {
        install(Postgrest)
        install(Auth)
    }

    val
}
