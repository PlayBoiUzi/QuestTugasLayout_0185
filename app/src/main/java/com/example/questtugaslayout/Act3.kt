package com.example.questtugaslayout

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp



@Composable
fun ActivitasPertama(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .padding(top = 50.dp, start = 16.dp, end = 16.dp)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Title Header
        Text(
            text = stringResource(R.string.prodi),
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = stringResource(R.string.univ),
            fontSize = 14.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(20.dp))

        // --- CARD 1 (Bambang Sumantri) ---
        CardItem(
            nama = stringResource(R.string.nama1),
            alamat = stringResource(R.string.alamat1),
            bgColor = Color(0xFF5A5A5A),
            fontFamily = FontFamily.Cursive
        )

        // --- CARD 2 (Gibran Fathoni) ---
        CardItem(
            nama = stringResource(R.string.nama2),
            noHp = stringResource(R.string.nohp2),
            alamat = stringResource(R.string.alamat2),
            bgColor = Color(0xFF7E38B7)
        )

        // --- CARD 3 (Zhilal Fadhilah) ---
        CardItem(
            nama = stringResource(R.string.nama3),
            noHp = stringResource(R.string.nohp3),
            alamat = stringResource(R.string.alamat3),
            bgColor = Color(0xFF0000FF)
        )

        // --- CARD 4 (Ahmad Alfian) ---
        CardItem(
            nama = stringResource(R.string.nama4),
            noHp = stringResource(R.string.nohp4),
            alamat = stringResource(R.string.alamat4),
            bgColor = Color(0xFF006400)
        )
