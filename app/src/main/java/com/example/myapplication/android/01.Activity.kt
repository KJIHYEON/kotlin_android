package com.example.myapplication.android

//01. Activity
// - 앱의 한 화면이다

// - Life Cycle (수명 주기)
//  onCreate -> activity가 만들어질 때 단 한 번만 호출
//          -> activity를 만들 때 단 한번만 하면 되는 작업들은 여기에서 해준다
//  onStart
//  onResume -> 앱이 다시 화면으로 돌아올 때
//           -> activity가 다시 호출될 때 하면 되는 작업들을 여기에서 해준다
//  onPause  -> 화면의 일부가 가려졌을 때
//  onStop -> 화면의 전부가 보이지 않을 때
//  onDestroy
