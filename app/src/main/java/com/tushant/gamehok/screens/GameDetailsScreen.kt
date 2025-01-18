package com.tushant.gamehok.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.tushant.gamehok.R
import com.tushant.gamehok.model.LeaderboardPeople
import com.tushant.gamehok.model.People
import com.tushant.gamehok.model.Tournament
import com.tushant.gamehok.ui.theme.Background
import com.tushant.gamehok.ui.theme.TextGreen
import com.tushant.gamehok.ui.theme.TextWhite

@Composable
fun GameDetailsScreen(navController: NavController) {
    Scaffold { innerPadding ->
        Box(
            modifier = Modifier.padding(innerPadding).fillMaxSize().background(Background)
        ) {
            Column(
                modifier = Modifier.fillMaxSize()
            ) {
                Column {
                    Box(
                        modifier = Modifier.fillMaxWidth().height(250.dp)
                    ) {
                        Image(
                            painter = painterResource(R.drawable.ic_game_pubg),
                            contentDescription = null,
                            contentScale = ContentScale.Crop,
                            modifier = Modifier.fillMaxSize()
                        )
                        IconButton(
                            onClick = { navController.navigateUp() },
                            modifier = Modifier.padding(12.dp).clip(CircleShape)
                                .background(Color(0x66011C0D)).align(Alignment.TopStart)
                        ) {
                            Image(
                                painter = painterResource(R.drawable.ic_left_arrow),
                                contentDescription = null,
                                modifier = Modifier.size(24.dp)
                            )
                        }
                    }
                }
                Spacer(modifier = Modifier.height(10.dp))
                Column(
                    modifier = Modifier.padding(16.dp).fillMaxWidth(),
                    verticalArrangement = Arrangement.SpaceBetween
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                    ) {
                        Text(
                            text = "PUBG",
                            fontSize = 20.sp,
                            fontFamily = FontFamily(Font(R.font.inter_24pt_bold)),
                            color = Color.White
                        )
                    }
                    Spacer(modifier = Modifier.height(10.dp))

                    val tags = listOf(
                        "BGMI", "Entry Level"
                    )

                    Row(
                        horizontalArrangement = Arrangement.spacedBy(6.dp)
                    ) {
                        tags.forEach { tag ->
                            Box(
                                modifier = Modifier.background(
                                    Color(0xFF002E14),
                                    RoundedCornerShape(6.dp)
                                ).padding(horizontal = 10.dp, vertical = 4.dp)
                            ) {
                                Text(
                                    text = tag,
                                    fontFamily = FontFamily(Font(R.font.inter_18pt_medium)),
                                    fontSize = 12.sp,
                                    color = Color.White
                                )
                            }
                        }
                    }
                }
                Spacer(modifier = Modifier.height(1.dp).fillMaxWidth().background(Color.White))
                Spacer(modifier = Modifier.height(10.dp))
                GameDetails(navController = navController)
            }
        }
    }
}

@Composable
fun GameDetails(navController: NavController) {
    Column(
        modifier = Modifier.padding(bottom = 16.dp).fillMaxWidth()
            .verticalScroll(rememberScrollState()).wrapContentHeight(),
    ) {
        Text(
            text = "Details",
            fontFamily = FontFamily(Font(R.font.inter_18pt_semi_bold)),
            fontSize = 20.sp,
            color = Color(0xFFECECEC),
            modifier = Modifier.padding(start = 16.dp, end = 16.dp)
        )
        Spacer(modifier = Modifier.height(18.dp))

        Row(modifier = Modifier.padding(start = 16.dp)) {
            TournamentDetailsTab(
                imageRes = R.drawable.ic_team, title = "TEAM TYPE", content = "Squad"
            )
        }
        Spacer(modifier = Modifier.height(18.dp))

        Row(modifier = Modifier.padding(start = 16.dp)) {
            TournamentDetailsTab(
                imageRes = R.drawable.ic_format,
                title = "FORMAT",
                content = "Single Elimination / Multi Elimination"
            )
        }
        Spacer(modifier = Modifier.height(30.dp))

        TournamentSection(
            tournamentList = listOf(
                Tournament(
                    R.drawable.ic_pubg_tournment,
                    "PUBG Tournament",
                    "By Red Bull",
                    listOf("BGMI", "Solo", "Entry - 10"),
                    "Starts 3rd Aug at 10:00 pm",
                    "Prize Pool - 1000",
                    "670/800",
                    "Registration Open"
                ), Tournament(
                    R.drawable.ic_pubg_tournment,
                    "PUBG Tournament",
                    "By Red Bull",
                    listOf("BGMI", "Solo", "Entry - 10"),
                    "Starts 3rd Aug at 10:00 pm",
                    "Prize Pool - 1000",
                    "670/800",
                    "Registration Open"
                ), Tournament(
                    R.drawable.ic_pubg_tournment,
                    "PUBG Tournament",
                    "By Red Bull",
                    listOf("BGMI", "Solo", "Entry - 10"),
                    "Starts 3rd Aug at 10:00 pm",
                    "Prize Pool - 1000",
                    "670/800",
                    "Registration Open"
                ), Tournament(
                    R.drawable.ic_pubg_tournment,
                    "PUBG Tournament",
                    "By Red Bull",
                    listOf("BGMI", "Solo", "Entry - 10"),
                    "Starts 3rd Aug at 10:00 pm",
                    "Prize Pool - 1000",
                    "670/800",
                    "Registration Open"
                )
            ),
            navController = navController,
        )
        Spacer(modifier = Modifier.height(28.dp))
        LeaderboardSection(
            peopleList = listOf(
                LeaderboardPeople(R.drawable.ic_profile_pic, "Legend Gamer", "#1"),
                LeaderboardPeople(R.drawable.ic_profile_pic, "Legend Gamer", "#2"),
                LeaderboardPeople(R.drawable.ic_profile_pic, "Legend Gamer", "#3"),
            )
        )
        Spacer(modifier = Modifier.height(28.dp))
        FollowSection(
            peopleList = listOf(
                People(R.drawable.ic_profile_pic, "Legend Gamer"),
                People(R.drawable.ic_profile_pic, "Legend Gamer"),
                People(R.drawable.ic_profile_pic, "Legend Gamer"),
            )
        )

        Spacer(modifier = Modifier.height(20.dp))
    }
}

@Composable
fun LeaderboardSection(
    peopleList: List<LeaderboardPeople>
) {
    Column(
        modifier = Modifier.fillMaxWidth().padding(start = 16.dp, end = 16.dp).wrapContentHeight()
    ) {
        Row(
            modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(bottom = 14.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Leaderboards",
                fontSize = 20.sp,
                fontFamily = FontFamily(Font(R.font.inter_18pt_semi_bold)),
                color = TextWhite
            )
            Text(
                text = "View More",
                fontSize = 14.sp,
                color = TextGreen,
                fontFamily = FontFamily(Font(R.font.inter_18pt_medium))
            )
        }
        LazyColumn(
            modifier = Modifier.fillMaxWidth().heightIn(max = 400.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)

        ) {
            items(peopleList.size) { idx ->
                LeaderboardRow(people = peopleList[idx])
            }
        }
    }
}

@Composable
fun LeaderboardRow(people: LeaderboardPeople) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier.fillMaxWidth()
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Image(
                painter = painterResource(people.imageRes),
                contentDescription = people.name,
                contentScale = ContentScale.Crop,
                modifier = Modifier.size(35.dp).clip(CircleShape)
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(
                text = people.name,
                fontSize = 14.sp,
                fontFamily = FontFamily(Font(R.font.inter_18pt_regular)),
                color = Color.White
            )
        }
        Text(
            text = people.position,
            color = Color.White,
            fontFamily = FontFamily(Font(R.font.inter_18pt_semi_bold)),
            fontSize = 16.sp
        )
    }
}