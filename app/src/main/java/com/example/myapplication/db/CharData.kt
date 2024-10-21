package com.example.myapplication.db

import com.example.myapplication.R
import com.example.myapplication.model.Char


object CharData {
    private val database = arrayOf(
            arrayOf(
                    "Alok",
                    "Alias : World-Famous DJ",
                    "Special Survival Ability : Drop The Beat",
                    "Using the power of music, Alok left Brazil and travelled the world. His name means “light”. He has signed a contract and a closed concert will happen on Free Fire’s battleground island for some VIP guests!",
                    R.drawable.img,
                    R.drawable.img_1,
            ),
            arrayOf(
                    "Chrono",
                    "Alias : Bounty Hunter",
                    "Special Survival Ability : Time Turner",
                    "Chrono comes from a parallel universe where there is a higher science and technology level than the levels in our current world Earth. He had a normal childhood in his original universe. His parents were famous lawyers who fought against poverty and helped bring the poor homeless people up into society. Because of this he always had an awareness about disadvantaged groups since he was very young and as he grew older he found ways to do his part to help as well.",
                    R.drawable.img_2,
                    R.drawable.img_3,
            ),
            arrayOf(
                    "Skyler",
                    "Alias : Entertainment CEO",
                    "Special Survival Ability : Riptide Rhythm",
                    "Skyler got his rise to fame as the hottest pop singer-dancer in the country, and he is now the CEO of the largest entertainment company in Vietnam. Driven to be the best musical talent in the business and to also find the best talent. He doesn't like to lose and believes that creativity allows people to see the good in the world instead of the bad.",
                    R.drawable.img_4,
                    R.drawable.img_5,
            ),
            arrayOf(
                    "Ryden",
                    "Alias : S16-Year-Old Inventive Genius",
                    "Special Survival Ability : Spider Trap",
                    "As a 16-year-old inventive genius, Ryden's rationality and knowledge both surpass his peers. The little boy, who used to sit under the wings of his sister Suzy, is now vanquishing the battlefields. His talented inventions will pave the way for him.",
                    R.drawable.img_6,
                    R.drawable.img_7,
            ),
            arrayOf(
                    "Hayato",
                    "Alias : Samurai Heir",
                    "Special Survival Ability : Bushido",
                    "Hayato had a lot riding on his shoulders as the eldest heir to the Yagami corporation. He was raised into a life where his existence was meant to serve the honor and glory of his family. When their family corporation was acquired by Horizon, he didn't hesitate to get involved in corporate affairs to make sure the Yagamis would still operate with honor." ,
                    R.drawable.img_8,
                    R.drawable.img_9,
            ),
            arrayOf(
                    "Luna",
                    "Alias : Guild Leader",
                    "Special Survival Ability : Fight-Or-Flight",
                    "Luna is the daughter of a complicated man with a complicated past. She matured early dealing with his recklessness and the recklessness of the adults she grew up around. When her father’s leadership in the Guild was challenged and was eventually kidnapped, Luna had to step up and create her own footsteps to take charge of the group and restore order to the community.",
                    R.drawable.img_10,
                    R.drawable.img_11,
            ),
            arrayOf(
                    "Tatsuya",
                    "Alias : Impulsive Hothead",
                    "Special Survival Ability : Rebel Rush",
                    "Tatsuya is torn between his feelings of betrayal and his love for his family. He doesn’t know how to deal with this dichotomy of feelings and willingly allows himself to get pulled into trouble. It is only after he and his brother, Shirou, need to work together to solve a conspiracy that he realizes he is not alone in the world and has the power to change his environment for the better.",
                    R.drawable.img_12,
                    R.drawable.img_13,
            ),
            arrayOf(
                    "Rafael",
                    "Alias : Gun For Hire",
                    "Special Survival Ability : Dead Silent",
                    "Rafael was a sweet family man until a terrible family tragedy sent him down the path of cold-heartedness and revenge. He now searches the world not only for the man who destroyed his family while taking contracts to bring justice to other evils. As the years went by, he realized life wasn’t as black and white as it seemed. The appearance of the lovely Laura in his life has now thrown another wrench into the carefully crafted structure of his life.",
                    R.drawable.img_14,
                    R.drawable.img_15,
            ),
            arrayOf(
                    "Homer",
                    "Alias : Blind Assasin",
                    "Special Survival Ability : Senses Shockwave",
                    "Homer is a blind man who is not only an assassin, but also one of the founders of the thriving tech gang in Griza. However, Homer, who had faded out of power in recent years, now only wants to Homer is a blind man who is not only an assassin, but also one of the founders of the thriving tech gang in Griza. However, Homer, who had faded out of power in recent years, now only wants to find the truth behind the strange disease that blinded him in his childhood, the mysterious research institute he called his school and the rare earth mineral linked to it all.",
                    R.drawable.img_16,
                    R.drawable.img_17,
            ),
            arrayOf(
                    "Kenta",
                    "Alias : Bladesmith",
                    "Special Survival Ability : Swordsman's Wrath",
                    "Kenta served as a bodyguard and bladesmith for Hayato Yagami\"s family for years. He is a man of few words but protects his new, young master in whatever situation they find themselves in. He does have his own personal desires, nut he puts them on the backburner as he serves Hayato during a dangerous time for the Yagami family.",
                    R.drawable.img_18,
                    R.drawable.img_19,
            ),
            arrayOf(
                    "Santino",
                    "Alias : Fashion Designer",
                    "Special Survival Ability : Shape Splitter",
                    "Born in poverty, Santino loved art ever since he was a child. He studied at a renowned art school where his talent in design flourished. After graduating, Santino established his fashion brand, Angelic, and became a celebrity with a keen eye for marketing. With great success in the field, he is always in the spotlight of the fasion world.",
                    R.drawable.img_20,
                    R.drawable.img_21,
            ),

    )

    val listData: ArrayList<Char>
        get(){
                val list = ArrayList<Char>()
                for (data in database) {
                        val Char = Char()
                        Char.name = data[0] as String
                        Char.alias = data[1] as String
                        Char.special = data[2] as String
                        Char.des = data[3] as String
                        Char.pic = data[4] as Int
                        Char.background = data[5] as Int

                        list.add(Char)
                }
                return list
        }
}