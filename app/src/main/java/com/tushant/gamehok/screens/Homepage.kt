package com.tushant.gamehok.screens

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.rememberPagerState
import com.tushant.gamehok.R
import com.tushant.gamehok.model.Course
import com.tushant.gamehok.model.Game
import com.tushant.gamehok.model.People
import com.tushant.gamehok.model.Tournament
import com.tushant.gamehok.ui.theme.Background
import com.tushant.gamehok.ui.theme.TextGreen
import com.tushant.gamehok.ui.theme.TextWhite
import com.tushant.gamehok.utils.CustomShape
import com.tushant.gamehok.utils.DotsIndicator
import com.tushant.gamehok.utils.RoundedRectangleShape

@Composable
fun Homepage(navController: NavController) {
    Scaffold(
        bottomBar = { BottomNavigationBar() }
    ) { innerPadding ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .background(Background)
        ) {
            item {
                ToolbarSection(
                    tickets = 245,
                    coins = 2456,
                    profileImage = painterResource(R.drawable.ic_nav)
                )
            }

            item {
                PremiumSection(pageCount = 3)
            }

            item {
                GamesSection(
                    gamesList = listOf(
                        Game(R.drawable.ic_pubg_tour, "PUBG"),
                        Game(R.drawable.ic_cod_tour, "Call of Duty"),
                        Game(R.drawable.ic_cs_tour, "Counter Strike"),
                        Game(R.drawable.ic_freefire_tour, "Free Fire"),
                    ),
                    navController
                )
            }

            item {
                Spacer(
                    modifier = Modifier
                        .height(1.dp)
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp)
                        .background(Color(0xFF414141))
                )
            }

            item {
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

            item {
                LearnSection(
                    pageCount = 3,
                    courseList = listOf(
                        Course(
                            R.drawable.ic_learn,
                            "Esports for Begginers",
                            "Start your journey with experts and be the professional you want",
                            "16 mins",
                            "By Abhijeet Nishal"
                        ),
                        Course(
                            R.drawable.ic_learn,
                            "Esports for Begginers",
                            "Start your journey with experts and be the professional you want",
                            "16 mins",
                            "By Abhijeet Nishal"
                        ),
                        Course(
                            R.drawable.ic_learn,
                            "Esports for Begginers",
                            "Start your journey with experts and be the professional you want",
                            "16 mins",
                            "By Abhijeet Nishal"
                        )
                    )
                )
            }

            item {
                FollowSection(
                    peopleList = listOf(
                        People(R.drawable.ic_profile_pic, "Legend Gamer"),
                        People(R.drawable.ic_profile_pic, "Legend Gamer"),
                        People(R.drawable.ic_profile_pic, "Legend Gamer"),
                    )
                )
            }
        }
    }
}

@Composable
fun ToolbarSection(
    tickets: Int,
    coins: Int,
    profileImage: Painter
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(Background)
            .padding(start = 16.dp, end = 16.dp, top = 8.dp, bottom = 8.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Image(
            painter = profileImage,
            contentDescription = "Profile Image",
            modifier = Modifier.size(40.dp)
        )
        Row(verticalAlignment = Alignment.CenterVertically) {
            Box(
                modifier = Modifier
                    .wrapContentSize()
                    .padding(12.dp)
                    .background(color = Color(0xFF01A74B), shape = RoundedRectangleShape())
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .padding(8.dp)
                        .wrapContentWidth()
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.ic_tickets),
                            contentDescription = "Tickets",
                            modifier = Modifier.size(20.dp)
                        )
                        Spacer(modifier = Modifier.width(4.dp))
                        Text(
                            text = tickets.toString(),
                            style = TextStyle(
                                color = TextWhite,
                                fontSize = 14.sp,
                                fontFamily = FontFamily(Font(R.font.inter_18pt_regular))
                            )
                        )
                    }
                    Spacer(modifier = Modifier.width(5.dp))
                    Spacer(
                        modifier = Modifier
                            .width(2.dp)
                            .fillMaxHeight()
                            .background(Color(0xFF0CF285))
                    )
                    Spacer(modifier = Modifier.width(5.dp))
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.ic_coins),
                            contentDescription = "Coins",
                            modifier = Modifier.size(20.dp)
                        )
                        Spacer(modifier = Modifier.width(4.dp))
                        Text(
                            text = coins.toString(),
                            style = TextStyle(
                                color = TextWhite,
                                fontSize = 14.sp,
                                fontFamily = FontFamily(Font(R.font.inter_18pt_regular))
                            )
                        )
                    }
                }
            }
            Icon(
                painter = painterResource(R.drawable.ic_alert),
                contentDescription = "Notifications",
                modifier = Modifier.size(24.dp),
                tint = Color.White
            )
        }
    }
}

@OptIn(ExperimentalPagerApi::class)
@Composable
fun PremiumSection(
    pageCount: Int
) {
    val pagerState = rememberPagerState()

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        HorizontalPager(
            count = pageCount,
            state = pagerState,
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight(),
            itemSpacing = 6.dp
        ) { page ->
            PremiumCard(page = page)
        }
        Spacer(modifier = Modifier.height(12.dp))

        DotsIndicator(
            totalDots = 3,
            selectedIndex = pagerState.currentPage
        )
    }
}

@Composable
fun PremiumCard(page: Int) {
    Card(
        shape = RoundedCornerShape(8.dp),
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight(),
        colors = CardDefaults.cardColors(
            containerColor = Color.Transparent
        ),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 4.dp
        )
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
                .background(
                    brush = Brush.linearGradient(
                        colors = listOf(
                            Color(0xFFFEEBA6),
                            Color(0xFFFFFFFF)
                        ),
                        start = Offset(164f, 0f),
                        end = Offset(160.54f, 149.84f)
                    )
                )
        ) {
            Column(
                modifier = Modifier
                    .padding(top = 10.dp, end = 14.dp, start = 14.dp, bottom = 16.dp),
                verticalArrangement = Arrangement.SpaceBetween
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "Gamehok",
                            fontSize = 18.sp,
                            fontFamily = FontFamily(Font(R.font.inter_18pt_bold)),
                            color = Color(0xFF091118)
                        )
                        Spacer(modifier = Modifier.width(6.dp))
                        Box(
                            modifier = Modifier
                                .padding(4.dp)
                                .background(
                                    brush = Brush.linearGradient(
                                        colors = listOf(Color(0xFFF0C346), Color(0xFFFFE293))
                                    ), shape = CustomShape()
                                )
                        ) {
                            Row(
                                verticalAlignment = Alignment.CenterVertically,
                            ) {
                                Text(
                                    text = "Premium",
                                    fontFamily = FontFamily(Font(R.font.inter_18pt_semi_bold)),
                                    fontSize = 12.sp,
                                    color = Color(0xFF091118),
                                    modifier = Modifier.padding(
                                        top = 2.dp,
                                        bottom = 2.dp,
                                        start = 6.dp,
                                        end = 6.dp
                                    )
                                )
                            }
                        }
                    }
                    Button(
                        onClick = {},
                        contentPadding = PaddingValues(
                            start = 8.dp,
                            end = 8.dp,
                            top = 6.dp,
                            bottom = 6.dp
                        ),
                        shape = RoundedCornerShape(8.dp),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color(0xFFFA7B4D)
                        )

                    ) {
                        Text(
                            text = "Get Now",
                            color = TextWhite,
                            fontFamily = FontFamily(Font(R.font.inter_18pt_semi_bold)),
                            fontSize = 16.sp
                        )
                    }
                }
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = "Upgrade to premium membership and get\n100 🎫 and many other premium features.",
                    fontSize = 14.sp,
                    color = Color(0xFF091118),
                    fontFamily = FontFamily(Font(R.font.inter_18pt_semi_bold))
                )
                Spacer(modifier = Modifier.height(8.dp))
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.align(Alignment.Start)
                ) {
                    Text(
                        text = "View All Feature",
                        fontSize = 14.sp,
                        fontFamily = FontFamily(Font(R.font.inter_18pt_medium)),
                        color = Color(0xFF01A74B)
                    )
                    Spacer(modifier = Modifier.width(4.dp))
                    IconButton(
                        onClick = {},
                        modifier = Modifier.size(16.dp),
                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_right_arrow),
                            contentDescription = "Right Arrow",
                            tint = Color(0xFF01A74B)
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun GamesSection(
    gamesList: List<Game>,
    navController: NavController
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 16.dp, bottom = 32.dp, start = 16.dp, end = 16.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 14.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Play Tournament by Games",
                fontSize = 20.sp,
                fontFamily = FontFamily(Font(R.font.inter_18pt_semi_bold)),
                color = TextWhite
            )
            Text(
                text = "View All",
                fontSize = 14.sp,
                color = TextGreen,
                fontFamily = FontFamily(Font(R.font.inter_18pt_medium))
            )
        }
        LazyRow(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            items(gamesList.size) { idx ->
                GameCard(
                    gameImage = gamesList[idx].imageRes,
                    gameName = gamesList[idx].title,
                    navController
                )
            }
        }
    }
}

@Composable
fun GameCard(
    gameImage: Int,
    gameName: String,
    navController: NavController
) {
    Column(
        modifier = Modifier
            .width(120.dp)
            .wrapContentHeight(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = gameImage),
            contentDescription = gameName,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .width(120.dp)
                .height(100.dp)
                .clip(RoundedCornerShape(8.dp))
                .clickable(onClick = { navController.navigate("game_details") })
        )

        Spacer(modifier = Modifier.height(4.dp))

        Text(
            text = gameName,
            color = TextWhite,
            fontSize = 12.sp,
            fontFamily = FontFamily(Font(R.font.inter_18pt_semi_bold))
        )
    }
}

@Composable
fun TournamentSection(tournamentList: List<Tournament>, navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 32.dp, bottom = 32.dp, start = 16.dp, end = 16.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 14.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Compete in Battles",
                fontSize = 20.sp,
                fontFamily = FontFamily(Font(R.font.inter_18pt_semi_bold)),
                color = TextWhite
            )
            Text(
                text = "View All",
                fontSize = 14.sp,
                color = TextGreen,
                fontFamily = FontFamily(Font(R.font.inter_18pt_medium))
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
    }
}

@Composable
fun TournamentCard(tournament: Tournament, navController: NavController) {
    Card(
        shape = RoundedCornerShape(8.5.dp),
        modifier = Modifier
            .width(285.dp)
            .wrapContentHeight()
            .clickable(onClick = { navController.navigate("tournament_details") }),
        colors = CardDefaults.cardColors(
            containerColor = Color.Transparent
        ),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 4.dp
        )
    ) {
        Box(
            modifier = Modifier
                .width(285.dp)
                .wrapContentHeight()
                .background(
                    brush = Brush.verticalGradient(
                        colors = listOf(
                            Color(0xFF56E293),
                            Color(0xFF062E17)
                        )
                    )
                )
                .border(
                    width = 1.dp,
                    color = Color(0xFF3C4B43),
                    shape = RoundedCornerShape(8.5.dp)
                )
        ) {
            Column {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(140.dp)
                ) {
                    Image(
                        painter = painterResource(tournament.imageRes),
                        contentDescription = null,
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .fillMaxSize()
                    )
                    Row(
                        modifier = Modifier
                            .align(Alignment.TopStart)
                            .padding(12.dp)
                            .background(
                                Color(0xFF001208).copy(alpha = 0.8f),
                                RoundedCornerShape(8.dp)
                            )
                            .wrapContentSize(),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = tournament.status,
                            fontSize = 12.sp,
                            color = Color.White,
                            fontFamily = FontFamily(Font(R.font.inter_18pt_regular)),
                            modifier = Modifier.padding(4.dp)
                        )
                    }
                    Row(
                        modifier = Modifier
                            .align(Alignment.TopEnd)
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
                            modifier = Modifier.size(16.dp)
                                .padding(start = 2.dp, top = 2.dp, bottom = 2.dp)
                        )
                        Spacer(modifier = Modifier.width(2.dp))
                        Text(
                            text = tournament.progress,
                            fontSize = 11.sp,
                            color = Color.White,
                            fontFamily = FontFamily(Font(R.font.inter_18pt_regular)),
                            modifier = Modifier.padding(end = 2.dp, top = 2.dp, bottom = 2.dp)
                        )
                    }

                    Image(
                        painter = painterResource(R.drawable.ic_redbull),
                        contentDescription = null,
                        modifier = Modifier
                            .align(Alignment.BottomEnd)
                            .offset(y = 30.dp)
                            .size(60.dp)
                            .padding(end = 12.dp)
                    )
                }

                Column(
                    modifier = Modifier.padding(
                        top = 8.dp,
                        end = 12.dp,
                        bottom = 20.dp,
                        start = 12.dp
                    )
                ) {
                    Text(
                        text = tournament.title,
                        fontFamily = FontFamily(Font(R.font.inter_18pt_semi_bold)),
                        fontSize = 16.sp,
                        color = Color.White
                    )
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(
                        text = tournament.organizer,
                        fontFamily = FontFamily(Font(R.font.inter_18pt_medium)),
                        fontSize = 14.sp,
                        color = Color.White
                    )
                    Spacer(modifier = Modifier.height(6.dp))
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(6.dp)
                    ) {
                        tournament.tags.forEach { tag ->
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

                    Spacer(modifier = Modifier.height(10.dp))

                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Image(
                            painter = painterResource(R.drawable.ic_timer),
                            contentDescription = "Timer",
                        )
                        Spacer(modifier = Modifier.width(4.dp))
                        Text(
                            text = tournament.time,
                            fontFamily = FontFamily(Font(R.font.inter_18pt_regular)),
                            fontSize = 13.sp,
                            color = Color.White
                        )
                    }

                    Spacer(modifier = Modifier.height(4.dp))

                    Row(
                        modifier = Modifier
                            .fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                        ) {
                            Image(
                                painter = painterResource(R.drawable.ic_trophy),
                                contentDescription = "Trophy",
                            )
                            Spacer(modifier = Modifier.width(4.dp))
                            Text(
                                text = tournament.prizePool,
                                fontFamily = FontFamily(Font(R.font.inter_18pt_regular)),
                                fontSize = 13.sp,
                                color = Color.White
                            )
                            Spacer(modifier = Modifier.width(2.dp))
                            Image(
                                painter = painterResource(R.drawable.ic_currency),
                                contentDescription = "Prize Icon",
                            )
                        }
                        IconButton(
                            onClick = {},
                            modifier = Modifier.size(10.dp),
                        ) {
                            Image(
                                painter = painterResource(R.drawable.ic_right_arrow),
                                contentDescription = "Right Arrow"
                            )
                        }
                    }
                }
            }
        }
    }
}

@OptIn(ExperimentalPagerApi::class)
@Composable
fun LearnSection(pageCount: Int, courseList: List<Course>) {
    val pagerState = rememberPagerState()

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
            .wrapContentHeight()
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 14.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Learn from the best to be the best",
                fontSize = 20.sp,
                fontFamily = FontFamily(Font(R.font.inter_18pt_semi_bold)),
                color = TextWhite
            )
        }

        HorizontalPager(
            count = pageCount,
            state = pagerState,
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight(),
            itemSpacing = 6.dp
        ) { page ->
            CourseCard(page = page, course = courseList[page])
        }
        Spacer(modifier = Modifier.height(8.dp))

        DotsIndicator(
            totalDots = 3,
            selectedIndex = pagerState.currentPage
        )
    }
}

@Composable
fun CourseCard(
    page: Int,
    course: Course
) {
    Card(
        shape = RoundedCornerShape(8.dp),
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight(),
        colors = CardDefaults.cardColors(containerColor = Color.Transparent),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
                .background(
                    brush = Brush.verticalGradient(
                        colors = listOf(
                            Color(0xFFFFFFFF),
                            Color(0xFFC4CFFF)
                        )
                    ),
                    shape = RoundedCornerShape(8.dp)
                )
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Image(
                        painter = painterResource(R.drawable.ic_learn),
                        contentScale = ContentScale.Crop,
                        contentDescription = null,
                        modifier = Modifier
                            .size(100.dp)
                            .clip(RoundedCornerShape(8.dp))
                    )
                    Spacer(modifier = Modifier.width(12.dp))
                    Column {
                        Text(
                            text = course.title,
                            fontSize = 16.sp,
                            fontFamily = FontFamily(Font(R.font.inter_18pt_semi_bold)),
                            color = Color(0xFF091118)
                        )
                        Spacer(modifier = Modifier.height(2.dp))
                        Text(
                            text = course.description,
                            fontSize = 14.sp,
                            fontFamily = FontFamily(Font(R.font.inter_18pt_regular)),
                            color = Color(0xFF091118)
                        )
                        Spacer(modifier = Modifier.height(8.dp))
                        Text(
                            text = course.author,
                            fontSize = 12.sp,
                            fontFamily = FontFamily(Font(R.font.inter_18pt_semi_bold)),
                            color = Color(0xFF4A4A4A)
                        )
                    }
                }
                Spacer(modifier = Modifier.height(8.dp))
                Spacer(
                    modifier = Modifier
                        .height(1.dp)
                        .background(Color(0xFFF2F2F2))
                        .fillMaxWidth()
                )
                Spacer(modifier = Modifier.height(4.dp))
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Image(
                            painter = painterResource(R.drawable.ic_clock),
                            contentDescription = "Clock",
                        )
                        Spacer(modifier = Modifier.width(4.dp))
                        Text(
                            text = course.duration,
                            fontSize = 12.sp,
                            fontFamily = FontFamily(Font(R.font.inter_18pt_medium)),
                            color = Color(0xFF4A4A4A)
                        )
                    }
                    Button(
                        onClick = {},
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color.Transparent
                        ),
                    ) {
                        Image(
                            painter = painterResource(R.drawable.ic_start),
                            contentDescription = null,
                        )
                        Spacer(modifier = Modifier.width(4.dp))
                        Text(
                            text = "Start Course",
                            color = Color(0xFF01A74B),
                            fontFamily = FontFamily(Font(R.font.inter_18pt_medium)),
                            fontSize = 14.sp
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun FollowSection(
    peopleList: List<People>
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .padding(16.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
                .padding(bottom = 14.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "People to follow",
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
            modifier = Modifier
                .fillMaxWidth()
                .heightIn(max = 400.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)

        ) {
            items(peopleList.size) { idx ->
                FollowRow(people = peopleList[idx])
            }
        }
    }
}

@Composable
fun FollowRow(people: People) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier.fillMaxWidth()
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Image(
                painter = painterResource(people.imageRes),
                contentDescription = people.name,
                contentScale = ContentScale.Fit,
                modifier = Modifier
                    .size(35.dp)
                    .clip(CircleShape)
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(
                text = people.name,
                fontSize = 14.sp,
                fontFamily = FontFamily(Font(R.font.inter_18pt_regular)),
                color = Color.White
            )
        }
        Button(
            onClick = {},
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF002E14)
            ),
            contentPadding = PaddingValues(8.dp),
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
}

@Composable
fun BottomNavigationBar() {
    var selectedItem by remember { mutableStateOf(0) }
    val items = listOf("Home", "My Tournament", "Social", "Chats")
    val icons = listOf(
        painterResource(R.drawable.ic_home),
        painterResource(R.drawable.ic_cup),
        painterResource(R.drawable.ic_profile),
        painterResource(R.drawable.ic_message)
    )

    val selectedIcons = listOf(
        painterResource(R.drawable.ic_selected_home),
        painterResource(R.drawable.ic_selected_cup),
        painterResource(R.drawable.ic_selected_profile),
        painterResource(R.drawable.ic_selected_message)
    )

    NavigationBar(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFF08090A)),
        containerColor = Color(0xFF08090A)
    ) {
        items.forEachIndexed { index, label ->
            NavigationBarItem(
                selected = selectedItem == index,
                onClick = { selectedItem = index },
                icon = {
                    Box(
                        contentAlignment = Alignment.Center
                    ) {
                        if (selectedItem == index) {
                            SpotlightEffect(
                                modifier = Modifier
                                    .align(Alignment.Center)

                            )
                        }
                        Image(
                            painter = if (selectedItem == index) selectedIcons[index] else icons[index],
                            contentDescription = null,
                            modifier = Modifier.size(24.dp)
                        )
                    }
                },
                label = {
                    Text(
                        text = label,
                        style = TextStyle(
                            fontSize = 10.sp,
                            fontFamily = FontFamily(Font(R.font.inter_18pt_medium)),
                            color = if (selectedItem == index) Color.White else Color(0xFFA8A8A8)
                        )
                    )
                },
                alwaysShowLabel = true,
                colors = NavigationBarItemDefaults.colors(
                    indicatorColor = Color.Transparent
                )
            )
        }
    }
}

@Composable
fun SpotlightEffect(
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = Modifier.size(44.dp)
    ) {
        Canvas(modifier = Modifier.matchParentSize()) {
            val width = size.width
            val height = size.height

            val path = Path().apply {
                moveTo(width / 2, -height / 3)
                cubicTo(0.0f, -height / 3, 0.0f, height, 0.0f, height)
                lineTo(width, height)
                cubicTo(width, height, width, -height / 3, width / 2, -height / 3)
                close()
            }

            drawPath(
                path = path,
                brush = Brush.linearGradient(
                    colors = listOf(
                        Color(0xFFD9D9D9),
                        Color(0x0000C800)
                    ),
                    start = Offset(width / 2, -height / 3),
                    end = Offset(width / 2, height * 2.65f)
                ),
                alpha = 0.2f
            )
        }
    }
}
