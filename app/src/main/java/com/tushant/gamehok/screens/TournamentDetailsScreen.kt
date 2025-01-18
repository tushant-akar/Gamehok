package com.tushant.gamehok.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.TabRowDefaults
import androidx.compose.material3.TabRowDefaults.tabIndicatorOffset
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.tushant.gamehok.R
import com.tushant.gamehok.model.Tournament
import com.tushant.gamehok.ui.theme.Background
import com.tushant.gamehok.ui.theme.Gray
import com.tushant.gamehok.ui.theme.TextWhite

@Composable
fun TournamentDetailsScreen(navController: NavController) {
    Scaffold { innerPadding ->
        Box(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize()
                .background(Background)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
            ) {
                Column {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(250.dp)
                    ) {
                        Image(
                            painter = painterResource(R.drawable.pubg),
                            contentDescription = null,
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .fillMaxSize()
                        )
                        IconButton(
                            onClick = { navController.navigateUp() },
                            modifier = Modifier
                                .padding(12.dp)
                                .clip(CircleShape)
                                .background(Color(0x66011C0D))
                                .align(Alignment.TopStart)
                        ) {
                            Image(
                                painter = painterResource(R.drawable.ic_left_arrow),
                                contentDescription = null,
                                modifier = Modifier.size(18.dp)
                            )
                        }
                        Button(
                            onClick = {},
                            modifier = Modifier
                                .padding(12.dp)
                                .size(32.dp)
                                .align(Alignment.TopEnd),
                            colors = ButtonDefaults.buttonColors(
                                containerColor = Color(0xFF002E14)
                            ),
                            shape = RoundedCornerShape(8.dp),
                            contentPadding = PaddingValues(0.dp)
                        ) {
                            Image(
                                painter = painterResource(R.drawable.ic_share),
                                contentDescription = null,
                                contentScale = ContentScale.Fit,
                                modifier = Modifier.size(24.dp)
                            )
                        }

                        Row(
                            modifier = Modifier
                                .align(Alignment.BottomStart)
                                .padding(12.dp)
                                .background(
                                    Color(0xFF001208).copy(alpha = 0.8f),
                                    RoundedCornerShape(8.dp)
                                )
                                .wrapContentSize(),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(
                                text = buildAnnotatedString {
                                    append("Registration Closes in ")
                                    withStyle(style = SpanStyle(fontWeight = FontWeight.Bold)) {
                                        append("2d 15h 10min")
                                    }
                                },
                                fontSize = 11.sp,
                                color = Color.White,
                                fontFamily = FontFamily(Font(R.font.inter_18pt_regular)),
                                modifier = Modifier.padding(
                                    top = 4.dp,
                                    bottom = 4.dp,
                                    start = 6.dp,
                                    end = 6.dp
                                )
                            )
                        }
                        Row(
                            modifier = Modifier
                                .align(Alignment.BottomEnd)
                                .padding(12.dp)
                                .background(
                                    Color(0xFF001208).copy(alpha = 0.8f),
                                    RoundedCornerShape(8.dp)
                                )
                                .wrapContentSize(),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Image(
                                painter = painterResource(R.drawable.ic_progress),
                                contentDescription = null,
                                modifier = Modifier.size(24.dp)
                                    .padding(start = 2.dp, top = 2.dp, bottom = 2.dp)
                            )
                            Spacer(modifier = Modifier.width(4.dp))
                            Text(
                                text = "670/800",
                                fontSize = 11.sp,
                                color = Color.White,
                                fontFamily = FontFamily(Font(R.font.inter_18pt_regular)),
                                modifier = Modifier.padding(
                                    top = 4.dp,
                                    bottom = 4.dp,
                                    start = 6.dp,
                                    end = 6.dp
                                )
                            )
                        }
                    }
                }
                Spacer(modifier = Modifier.height(10.dp))
                Column(
                    modifier = Modifier
                        .padding(16.dp)
                        .fillMaxWidth(),
                    verticalArrangement = Arrangement.SpaceBetween
                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Column {
                            Text(
                                text = "PUBG tournament",
                                fontSize = 20.sp,
                                fontFamily = FontFamily(Font(R.font.inter_24pt_bold)),
                                color = Color.White
                            )
                            Spacer(modifier = Modifier.height(2.dp))
                            Text(
                                text = "By Red Bull",
                                fontSize = 14.sp,
                                fontFamily = FontFamily(Font(R.font.inter_18pt_semi_bold)),
                                color = Color.White
                            )
                        }
                        Image(
                            painter = painterResource(R.drawable.ic_redbull),
                            contentDescription = null,
                            modifier = Modifier.size(48.dp)
                        )
                    }
                    Spacer(modifier = Modifier.height(10.dp))

                    val tags = listOf(
                        "BGMI",
                        "Entry-10 "
                    )

                    Row(
                        horizontalArrangement = Arrangement.spacedBy(6.dp)
                    ) {
                        tags.forEach { tag ->
                            Box(
                                modifier = Modifier
                                    .background(Color(0xFF002E14), RoundedCornerShape(6.dp))
                                    .padding(horizontal = 10.dp, vertical = 4.dp)
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
                Spacer(modifier = Modifier.height(10.dp))
                TournamentTabs()

                TournamentDetails(navController)
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .align(Alignment.BottomCenter)
                    .shadow(4.dp, shape = RoundedCornerShape(8.dp))
                    .background(Background),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Button(
                    onClick = {},
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFF01B752),
                    ),
                    shape = RoundedCornerShape(8.dp),
                ) {
                    Text(
                        text = "JOIN TOURNAMENT",
                        fontFamily = FontFamily(Font(R.font.inter_18pt_semi_bold)),
                        fontSize = 16.sp,
                        color = Color.White
                    )
                }
            }
        }
    }
}


@Composable
fun TournamentDetails(navController: NavController) {
    Column(
        modifier = Modifier
            .padding(24.dp)
            .fillMaxWidth()
            .wrapContentHeight()
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.SpaceBetween,
    ) {
        Text(
            text = "Details",
            fontFamily = FontFamily(Font(R.font.inter_18pt_semi_bold)),
            fontSize = 20.sp,
            color = Color(0xFFECECEC)
        )
        Spacer(modifier = Modifier.height(18.dp))

        TournamentDetailsTab(
            imageRes = R.drawable.ic_team,
            title = "TEAM SIZE",
            content = "Solo"
        )
        Spacer(modifier = Modifier.height(18.dp))

        TournamentDetailsTab(
            imageRes = R.drawable.ic_format,
            title = "FORMAT",
            content = "Single Elimination"
        )
        Spacer(modifier = Modifier.height(18.dp))

        TournamentDetailsTab(
            imageRes = R.drawable.ic_date,
            title = "TOURNAMENT STARTS",
            content = "Tue 24th Jan 2024, 01:00 PM"
        )
        Spacer(modifier = Modifier.height(18.dp))

        TournamentDetailsTab(
            imageRes = R.drawable.ic_check_in,
            title = "CHECK-IN",
            content = "10 mins before the match starts"
        )
        Spacer(modifier = Modifier.height(40.dp))

        PrizeCard()
        Spacer(modifier = Modifier.height(40.dp))

        RoundDetails()
        Spacer(modifier = Modifier.height(40.dp))

        Column(
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                text = "How to Join a Match",
                fontSize = 20.sp,
                color = TextWhite,
                fontFamily = FontFamily(Font(R.font.inter_18pt_bold))
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = "• Have your game open already and on the latest version",
                color = Color(0xFFBCBCBC),
                fontFamily = FontFamily(Font(R.font.inter_18pt_regular)),
                fontSize = 14.sp
            )
            Text(
                "• Once the match is configured you will receive an invite in-game to join the lobby.",
                color = Color(0xFFBCBCBC),
                fontFamily = FontFamily(Font(R.font.inter_18pt_regular)),
                fontSize = 14.sp
            )
            Text(
                "• Join the match and wait for the game to start.",
                color = Color(0xFFBCBCBC),
                fontFamily = FontFamily(Font(R.font.inter_18pt_regular)),
                fontSize = 14.sp
            )
            Text(
                "• When eliminated return to the match room page to be ready to join the next map in the round.",
                color = Color(0xFFBCBCBC),
                fontFamily = FontFamily(Font(R.font.inter_18pt_regular)),
                fontSize = 14.sp
            )
        }
        Spacer(modifier = Modifier.height(40.dp))

        OrganizerDetails(
            organizer = "Gamehok Esports"
        )
        Spacer(modifier = Modifier.height(55.dp))

        MoreTournamentSection(
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
                ),
                Tournament(
                    R.drawable.ic_pubg_tournment,
                    "PUBG Tournament",
                    "By Red Bull",
                    listOf("BGMI", "Solo", "Entry - 10"),
                    "Starts 3rd Aug at 10:00 pm",
                    "Prize Pool - 1000",
                    "670/800",
                    "Registration Open"
                ),
                Tournament(
                    R.drawable.ic_pubg_tournment,
                    "PUBG Tournament",
                    "By Red Bull",
                    listOf("BGMI", "Solo", "Entry - 10"),
                    "Starts 3rd Aug at 10:00 pm",
                    "Prize Pool - 1000",
                    "670/800",
                    "Registration Open"
                ),
                Tournament(
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
            navController = navController
        )
    }
    Spacer(modifier = Modifier.height(56.dp))
}

@Composable
fun MoreTournamentSection(tournamentList: List<Tournament>, navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 32.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "More tournaments for you",
                fontSize = 20.sp,
                fontFamily = FontFamily(Font(R.font.inter_18pt_semi_bold)),
                color = TextWhite
            )
        }
        LazyRow(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            items(tournamentList.size) { idx ->
                TournamentCard(tournament = tournamentList[idx], navController = navController)
            }
        }
        Spacer(modifier = Modifier.height(56.dp))
    }
}

@Composable
fun OrganizerDetails(
    organizer: String
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .border(
                border = BorderStroke(
                    2.dp,
                    Color(0xFF1A2A21)
                ),
                shape = RoundedCornerShape(8.dp)
            ),
        colors = CardDefaults.cardColors(
            containerColor = Color.Transparent
        ),
        shape = RoundedCornerShape(8.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(
                    brush = Brush.horizontalGradient(
                        colors = listOf(
                            Color(0xFF4D5A53),
                            Color(0xFF182920)
                        )
                    )
                ),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Organiser's Details and contact",
                fontFamily = FontFamily(Font(R.font.inter_18pt_regular)),
                fontSize = 16.sp,
                color = Color.White,
                modifier = Modifier.padding(12.dp)
            )
        }
        Spacer(modifier = Modifier.height(10.dp))
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 12.dp, end = 12.dp, bottom = 12.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Image(
                        painter = painterResource(R.drawable.ic_g),
                        contentDescription = null,
                        modifier = Modifier.size(24.dp)
                    )
                    Spacer(modifier = Modifier.width(4.dp))
                    Text(
                        text = organizer,
                        fontFamily = FontFamily(Font(R.font.inter_18pt_semi_bold)),
                        fontSize = 16.sp,
                        color = TextWhite
                    )
                }
                Button(
                    onClick = {},
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFF002E14)
                    ),
                    contentPadding = PaddingValues(
                        top = 4.dp,
                        bottom = 4.dp,
                        start = 8.dp,
                        end = 8.dp
                    ),
                    shape = RoundedCornerShape(8.dp)
                ) {
                    Text(
                        text = "Follow",
                        color = Color.White,
                        fontFamily = FontFamily(Font(R.font.inter_18pt_medium)),
                        fontSize = 12.sp
                    )
                }
            }
            Spacer(modifier = Modifier.height(2.dp))
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "This is the in house organiser of this platform\nyou can follow our page on this platform for\nregular updates",
                    fontSize = 12.sp,
                    fontFamily = FontFamily(Font(R.font.inter_18pt_medium)),
                    color = Gray
                )
            }
            Spacer(modifier = Modifier.height(6.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                ContactElement(
                    imageRes = R.drawable.ic_phone,
                    text = "9890987754"
                )
                ContactElement(
                    imageRes = R.drawable.ic_mail,
                    text = "Support@gamehok.com"
                )
            }
            Spacer(modifier = Modifier.height(8.dp))
            Row(verticalAlignment = Alignment.CenterVertically) {
                ContactElement(
                    imageRes = R.drawable.ic_whatsapp,
                    text = "9890987754"
                )
            }
        }
    }
}

@Composable
fun ContactElement(
    imageRes: Int,
    text: String
) {
    Row(
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(imageRes),
            contentDescription = null,
            modifier = Modifier.size(16.dp)
        )
        Spacer(modifier = Modifier.width(4.dp))
        Text(
            text = text,
            fontFamily = FontFamily(Font(R.font.inter_18pt_regular)),
            fontSize = 14.sp,
            color = Gray
        )
    }
}

@Composable
fun RoundDetails() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Text(
            text = "Rounds and Schedule",
            fontSize = 20.sp,
            color = TextWhite,
            fontFamily = FontFamily(Font(R.font.inter_18pt_bold))
        )
        Spacer(modifier = Modifier.height(10.dp))
        RoundRow(
            round = "Round 1",
            date = "3rd Aug, 10:00 pm",
            top = "Top 4 to next round"
        )
        Spacer(modifier = Modifier.height(8.dp))

        RoundRow(
            round = "Round 1",
            date = "3rd Aug, 10:00 pm",
            top = "Top 4 to next round"
        )
        Spacer(modifier = Modifier.height(8.dp))

        RoundRow(
            round = "Round 1",
            date = "3rd Aug, 10:00 pm",
            top = "Top 4 to next round"
        )
    }
}

@Composable
fun RoundRow(
    round: String,
    date: String,
    top: String
) {
    Column(modifier = Modifier.fillMaxWidth()) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text(
                        text = "Qualifiers",
                        fontFamily = FontFamily(Font(R.font.inter_18pt_semi_bold)),
                        fontSize = 14.sp,
                        color = TextWhite
                    )
                    Spacer(modifier = Modifier.width(2.dp))
                    Text(
                        text = "($round)",
                        fontFamily = FontFamily(Font(R.font.inter_18pt_regular)),
                        fontSize = 14.sp,
                        color = Gray
                    )
                }
                Row(
                    modifier = Modifier
                        .wrapContentWidth()
                        .background(
                            brush = Brush.linearGradient(
                                colors = listOf(Color(0xFF311A61), Color(0xFF1C192E)),
                                start = Offset(0f, 0f),
                                end = Offset(Float.POSITIVE_INFINITY, 0f)
                            ),
                            shape = RoundedCornerShape(8.dp)
                        ),
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Text(
                        text = "Single Elimination",
                        fontSize = 12.sp,
                        fontFamily = FontFamily(Font(R.font.inter_18pt_medium)),
                        color = Color.White,
                        modifier = Modifier.padding(
                            start = 8.dp,
                            end = 8.dp,
                            top = 4.dp,
                            bottom = 4.dp
                        )
                    )
                }
            }
        }
        Spacer(modifier = Modifier.height(6.5.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = top,
                fontFamily = FontFamily(Font(R.font.inter_18pt_regular)),
                color = Gray,
                fontSize = 14.sp
            )
            Text(
                text = date,
                fontFamily = FontFamily(Font(R.font.inter_18pt_medium)),
                color = Gray,
                fontSize = 12.sp
            )
        }
        Spacer(modifier = Modifier.height(10.dp))
        Spacer(modifier = Modifier.height(1.dp).fillMaxWidth().background(Color(0xFF3C4B43)))
    }
}

@Composable
fun TournamentDetailsTab(
    imageRes: Int,
    title: String,
    content: String
) {
    Row(
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(imageRes),
            contentDescription = null,
            modifier = Modifier.size(32.dp)
        )
        Spacer(modifier = Modifier.width(8.dp))
        Column {
            Text(
                text = title,
                fontFamily = FontFamily(Font(R.font.inter_18pt_medium)),
                fontSize = 12.sp,
                color = Gray
            )
            Spacer(modifier = Modifier.height(2.dp))
            Text(
                text = content,
                fontFamily = FontFamily(Font(R.font.inter_18pt_semi_bold)),
                fontSize = 16.sp,
                color = Color.White
            )
        }
    }
}

@Composable
fun PrizeCard() {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight(),
        colors = CardDefaults.cardColors(
            containerColor = Color.Transparent
        ),
        shape = RoundedCornerShape(8.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(
                    brush = Brush.horizontalGradient(
                        colors = listOf(
                            Color(0xFF4D5A53),
                            Color(0xFF182920)
                        )
                    )
                ),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "Total Tournament Prize",
                fontFamily = FontFamily(Font(R.font.inter_18pt_semi_bold)),
                fontSize = 18.sp,
                color = TextWhite,
                modifier = Modifier.padding(start = 12.dp, top = 20.dp, bottom = 20.dp)
            )
            Row(verticalAlignment = Alignment.CenterVertically) {
                Text(
                    text = "2000",
                    fontFamily = FontFamily(Font(R.font.inter_18pt_semi_bold)),
                    fontSize = 18.sp,
                    color = Color.White
                )
                Spacer(modifier = Modifier.width(4.dp))
                Image(
                    painter = painterResource(R.drawable.ic_g),
                    contentDescription = null,
                    modifier = Modifier
                        .size(40.dp)
                        .padding(end = 12.dp)
                )
            }
        }
        PrizeRow(position = "1st", prize = 1000)
        Spacer(modifier = Modifier.height(1.dp))

        PrizeRow(position = "2nd", prize = 500)
        Spacer(modifier = Modifier.height(1.dp))

        PrizeRow(position = "3rd", prize = 200)
        Spacer(modifier = Modifier.height(1.dp))

        PrizeRow(position = "4th", prize = 100)
        Spacer(modifier = Modifier.height(1.dp))

        PrizeRow(position = "5th", prize = 100)
    }
}

@Composable
fun PrizeRow(
    position: String,
    prize: Int
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White.copy(alpha = 0.1f))
            .drawBehind {
                val strokeWidth = 1.dp.toPx()
                drawRect(
                    color = Color(0xFF001208),
                    style = Stroke(width = strokeWidth)
                )
            },
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Icon(
                painter = painterResource(R.drawable.ic_trophy),
                contentDescription = null,
                tint = Color.White,
                modifier = Modifier.size(42.dp).padding(start = 12.dp)
            )
            Spacer(modifier = Modifier.width(4.dp))
            Text(
                text = "$position Prize",
                fontFamily = FontFamily(Font(R.font.inter_18pt_regular)),
                fontSize = 16.sp,
                color = Color.White,
                modifier = Modifier.padding(top = 18.dp, bottom = 18.dp)
            )
        }
        Row(verticalAlignment = Alignment.CenterVertically) {
            Text(
                text = prize.toString(),
                fontFamily = FontFamily(Font(R.font.inter_18pt_semi_bold)),
                fontSize = 16.sp,
                color = Color.White
            )
            Spacer(modifier = Modifier.width(4.dp))
            Image(
                painter = painterResource(R.drawable.ic_g),
                contentDescription = null,
                modifier = Modifier.size(32.dp).padding(end = 12.dp),
                contentScale = ContentScale.Fit
            )
        }
    }
}

@Composable
fun TournamentTabs() {
    val tabs = listOf("Overview", "Players", "Rules")
    var selectedTabIndex by remember { mutableStateOf(0) }

    Column {
        TabRow(
            selectedTabIndex = selectedTabIndex,
            containerColor = Background,
            contentColor = Color.White,
            indicator = { tabPositions ->
                TabRowDefaults.SecondaryIndicator(
                    Modifier
                        .tabIndicatorOffset(tabPositions[selectedTabIndex])
                        .height(4.dp),
                    color = Color.White
                )
            }
        ) {
            tabs.forEachIndexed { index, title ->
                Tab(
                    selected = selectedTabIndex == index,
                    onClick = { selectedTabIndex = index },
                    text = {
                        Text(
                            text = title,
                            color = if (selectedTabIndex == index) Color.White else Color(
                                0x80FFFFFF
                            )
                        )
                    }
                )
            }
        }
    }
}