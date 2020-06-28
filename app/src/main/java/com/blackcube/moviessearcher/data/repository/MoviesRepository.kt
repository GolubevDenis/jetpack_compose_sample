package com.blackcube.moviessearcher.data.repository

import android.content.res.Resources
import androidx.ui.graphics.imageFromResource
import com.blackcube.moviessearcher.R
import com.blackcube.moviessearcher.domain.models.Genre
import com.blackcube.moviessearcher.domain.models.Movie

interface MoviesRepository {

    fun allMovies(): List<Movie>
    fun moviesFor(genre: Genre): List<Movie>
    fun genres(): List<Genre>

}

class MoviesStabRepository(
    private val resources: Resources
) : MoviesRepository {

    private val movies = listOf(

        Movie("Иван Васильевич меняет профессию", 1973,
            "\"Иван Васильевич меняет профессию\". Лучшая советская комедия. Отреставрированная версия в хорошем качестве (FullHD).\n" +
                    "\n" +
                    "Комедия \"Иван Васильевич меняет профессию\", СССР, 1973 г.\n" +
                    "О волшебной силе науки, способной в одночасье перенести самодержца российского Ивана Васильевича Грозного в обычную московскую квартиру, а на его место отправить трусливого управдома и мелкого жулика. Однажды инженер Тимофеев испытал потрясение от собственного изобретения: начала действовать машина времени, соединив его квартиру с палатами великого государя Ивана Васильевича Грозного, который хоть и горевал по роскошной прежней жизни, однако в тоску и отчаяние в новой Москве не стал впадать. До этого знаменательного события в квартире молодого изобретателя находились домоуправ Бунша и уголовник Жорж, которые исчезли строго в обратном направлении...\n" +
                    "\n" +
                    "\n" +
                    "- Главный приз на XXIV МКФ трудящихся Чехословакии, Прага (1974)\n" +
                    "\n" +
                    "Режиссер: Гайдай Леонид Иович\n" +
                    "Сценаристы: Бахнов Владлен, Гайдай Леонид Иович\n" +
                    "Композитор: Зацепин Александр\n" +
                    "\n" +
                    "В главных ролях: Демьяненко Александр, Куравлев Леонид, Яковлев Юрий, Крамаров Савелий, Селезнева Наталья, Этуш Владимир, Пуговкин Михаил, Кустинская Наталья, Крачковская Наталья, Филиппов Сергей",
            "СССР", "http://simkaget.xyz/get1/mp4_kinosimka.tv_key141f31/Ivan.Vasilevich.menyaet.professiyu.1973_Kinosimka.RU.mp4", R.drawable.ivan_vasilievich, Genre.COMEDY)

        , Movie("Девчата", 1961,
            "Комедийный художественный фильм  \"Девчата\", снятый в 1961 г.,  в СССР режиссёром Юрием Чулюкиным по одноимённой повести Б. Бедного.\n" +
                    "\n" +
                    "На северные лесозаготовки приезжает Тося Кислицына — выпускница Симферопольского кулинарного училища, сирота, совсем девчонка, — умница, настоящий товарищ. На первых же танцах она отбривает местного кумира — лучшего бригадира Илью Ковригина, и начинается у них любовь-борьба, в лучших традициях советских лирических комедий.\n" +
                    "\n" +
                    "Первый раз комедию показали в марте 1962 года в зале ЦДК. На премьеру пришли все, кроме Инны Макаровой. Она была обижена за то, что убрали финальную сцену её расставания с женихом. Картина сразу понравилась зрителям и даже критикам. Но высокое начальство посчитало, что комедия чересчур бытовая и мелковата для советского экрана, поэтому фильму была присвоена третья прокатная категория.\n" +
                    "За рубежом картина имела успех. Получила приз Эдинбургского кинофестиваля и приз кинофестиваля в Мар-дель-Плата. Зарубежные газеты называли Румянцеву «Чарли Чаплин в юбке», а итальянцы — «русской Джульеттой Мазиной».\n" +
                    "\n" +
                    "Режиссер: Чулюкин Юрий\n" +
                    "Сценаристы: Бедный Борис\n" +
                    "Композитор: Пахмутова Александра\n" +
                    "\n" +
                    "В главных ролях: Рыбников Николай, Овчинникова Люсьена, Румянцева Надежда, Хитров Станислав, Филиппов Роман, Дружинина Светлана, Адоскин Анатолий Михайлович, Меньшикова Нина, Пуговкин Михаил, Макарова Инна",
            "СССР", "http://simkaget.xyz/get1/mp4_kinosimka.tv_key141f31/Devchata.1961.RUS.BDRip__Kinosimka.RU.mp4", R.drawable.devchata, Genre.COMEDY)

        , Movie("Любовь и голуби", 1984,
            "У рабочего леспромхоза – жена Надя, трое детей и голубятня. Впервые в жизни он по путевке едет на юг. Там наивный деревенский простак встречает роковую женщину Раису Захаровну и… возвращается с отдыха не к себе в деревню, а в дом новой знакомой. Начинается для него новая жизнь, в которой много непонятного и интересного, но нет дома, где остались Надя, дети и голуби…\n" +
                    "\n" +
                    "Интересные фрагменты:\n" +
                    "0:00 Начало фильма\n" +
                    "17:55 Инфаркт Микарда\n" +
                    "47:45 Письмо\n" +
                    "53:00 Не держите его, отпустите\n" +
                    "1:19:45 Не пойду\n" +
                    "\n" +
                    "Режиссёр: Меньшов Владимир\n" +
                    "Сценарист: Гуркин Владимир\n" +
                    "Композитор: Левашов Валентин\n" +
                    "Оператор: Невский Юрий\n" +
                    "Художник-постановщик: Ясюкевич Феликс\n" +
                    "\n" +
                    "В ролях: Гурченко Людмила, Дорошина Нина, Михайлов Александр, Юрский Сергей, Лях Игорь, Тенякова Наталья, Лисовская Янина, Сизоненко Лада",
            "СССР", "https://simkahost.xyz/2/mp4_kinosimka.tv_key141f31/Lubov_and_Golubi__Kinosimka.RU.mp4", R.drawable.love_and_pigeons, Genre.COMEDY)

        , Movie("Человек - амфибия", 1963,
            "По мотивам одноименного приключенческо-фантастического романа Александра Беляева.\n" +
                    "В приморском городке давно ходят слухи о \"морском дьяволе\". Бизнесмен Зурита, промышляющий добычей жемчуга, не верит им до тех пор, пока не сталкивается с ним сам при весьма драматических обстоятельствах.\n" +
                    "А столкнувшись, ставит перед собой цель — заполучить \"дьявола\" себе. \"Дьяволом\" оказывается юноша, которому в детстве, чтобы спасти жизнь, пересадили\n" +
                    "вместо легких жабры акулы. И теперь Ихтиандр может жить и на земле, и в воде. Влюбившись в Гуттиэре, на которой Зурита собирается жениться, Ихтиандр стал его заклятым врагом и желанной добычей...\n" +
                    "На конкурсе фильмов 1962 года, проведенном журналом «Советский экран», зрители назвали фильм среди 5 лучших, в пятерку лучших актеров вошли А.Вертинская и В.Коренев, композитор А.Петров и оператор Э.Розовский (1963).\n" +
                    "Второй приз «Серебряный космический корабль» на I МКФ научно-фантастических фильмов в Триесте (1963).",
            "СССР", "https://r3---sn-gvnuxaxjvh-gv8z.googlevideo.com/videoplayback?expire=1593364073&ei=CXr4XtDmEJGGyQW127f4BA&ip=2a06%3Ac006%3Afa5c%3Ab7df%3Ab0ba%3A11db%3A7de9%3Aa889&id=o-ADcfAq0aKRJeAHudP_mAgz4KTSaBYK4ZsWehXxLz8fmw&itag=22&source=youtube&requiressl=yes&vprv=1&mime=video%2Fmp4&ratebypass=yes&dur=5781.072&lmt=1548286814638219&fvip=14&beids=23874723&c=WEB&txp=5535432&sparams=expire%2Cei%2Cip%2Cid%2Citag%2Csource%2Crequiressl%2Cvprv%2Cmime%2Cratebypass%2Cdur%2Clmt&sig=AOq0QJ8wRQIhAO_J44BhEt6Ks3-QMVzTLj6qaB6kaNQeewG69ELmX5KYAiAiN27_bf_8jDFLZCzWF01hWyIeOB3uZAC1Z4UVoEd83g%3D%3D&title=celovek-amfibiya-sovetskiy-film-fantastika-melodrama_(videomega.ru)&cms_redirect=yes&mh=7C&mip=109.165.15.200&mm=31&mn=sn-gvnuxaxjvh-gv8z&ms=au&mt=1593342393&mv=m&mvi=2&pl=18&lsparams=mh,mip,mm,mn,ms,mv,mvi,pl&lsig=AG3C_xAwRQIhALO054D4_WdT8y32oHB2y7RK0gEwYv9VdMtmQ_wup0bqAiBZF9fUqdZt9V0mbkaKHuIE4FKJXzW6BLf4ulbF6uFjLQ%3D%3D", R.drawable.amphibian_man, Genre.FANTASY)

        , Movie("На войне как на войне", 1969,
            "Действие происходит в конце войны. Младший лейтенант Малешкин, только что закончивший военное училище, назначен командиром \"самоходки\". Его экипаж — бывалые бойцы, прошедшие уже не один бой. Их совместная жизнь, боевая и будничная,\n" +
                    "радости и заботы, мужество и героизм — стали основой фильма.",
            "СССР", "https://redirector.googlevideo.com/videoplayback?expire=1593364293&ei=5Hr4XpitPMSy7ASDtZiABw&ip=2a06%3Ac006%3Afa5c%3Ab7df%3Ab0ba%3A11db%3A7de9%3Aa889&id=o-AHX6tr_zurlJHj04om6SqlpexoIXSW_Vpr1TijhaY1-s&itag=18&source=youtube&requiressl=yes&mh=kh&mm=31%2C29&mn=sn-4pvgq-n8ve%2Csn-n8v7knes&ms=au%2Crdu&mv=u&mvi=0&pcm2cms=yes&pl=32&vprv=1&mime=video%2Fmp4&gir=yes&clen=309376748&ratebypass=yes&dur=5099.775&lmt=1552076444711141&mt=1593342044&fvip=15&c=WEB&txp=5531432&sparams=expire%2Cei%2Cip%2Cid%2Citag%2Csource%2Crequiressl%2Cvprv%2Cmime%2Cgir%2Cclen%2Cratebypass%2Cdur%2Clmt&sig=AOq0QJ8wRQIhAKgPZkR8DHucVTAph2g5XcvrPspa9-S_2f8wLdnszPf1AiBCoXH0r89ytqQ_LcHB7jWmM3yWqfdb_8XH9_2IdWvvjw%3D%3D&lsparams=mh%2Cmm%2Cmn%2Cms%2Cmv%2Cmvi%2Cpcm2cms%2Cpl&lsig=AG3C_xAwQwIfFzpSlf4o90WZIrujgDdimJkQ7EznIon0Y3Ornt3L5wIgcP1mh9tYXxhqaITQPKegLn8l9cwYIwkhW7InUlRVAso%3D&title=na-voyne-kak-na-voyne-sovetskiy-film-pro-voynu_(videomega.ru)", R.drawable.at_war_as_at_war, Genre.WAR)

        , Movie("Александр Невский", 1938,
            "\"Александр Невский\" фильм Сергея Эйзенштейна - классика мирового кинематографа. Этот фильм знаменит фразой, которую его создатели вложили в уста Александра Невского: «А если кто с мечом к нам войдет — от меча и погибнет. На том стояла, и стоять будет земля русская!». История борьбы великого князя-полководца с тевтонскими рыцарями и великой победы в Ледовом побоище. Фильм снимался по социальному заказу в преддверии грядущей войны с фашистской Германией. Однако сразу после выхода картины в прокат, был подписан знаменитый пакт о ненападении, и все копии картины были изъяты из кинотеатров. Зритель вновь увидел фильм лишь в 1941 году, когда пакт о ненападении был нарушен.",
            "СССР", "https://redirector.googlevideo.com/videoplayback?expire=1593364199&ei=h3r4Xs_sFLvo7QTclb6YBQ&ip=2a06%3Ac006%3Afa5c%3Ab7df%3Ab0ba%3A11db%3A7de9%3Aa889&id=o-APBJudYvxLjMx5dqWPmhfdsi9rwaWC9EyTHtOqSBdJjQ&itag=22&source=youtube&requiressl=yes&mh=SC&mm=31%2C29&mn=sn-4pvgq-n8ve%2Csn-n8v7kn7k&ms=au%2Crdu&mv=u&mvi=2&pl=32&gcr=ru&vprv=1&mime=video%2Fmp4&ratebypass=yes&dur=6204.348&lmt=1552271485663594&mt=1593342044&fvip=3&beids=9466585&c=WEB&txp=5535432&sparams=expire%2Cei%2Cip%2Cid%2Citag%2Csource%2Crequiressl%2Cgcr%2Cvprv%2Cmime%2Cratebypass%2Cdur%2Clmt&sig=AOq0QJ8wRQIhALRnYM-Yf9MANlOxB_fgKgkLYUMN6C3kbK2d_496DsR5AiANSnwsnTqkL0dGkIjbDPFHrVKuspLH4jSQsv5vXI4jyQ%3D%3D&lsparams=mh%2Cmm%2Cmn%2Cms%2Cmv%2Cmvi%2Cpl&lsig=AG3C_xAwRQIgXSnUzSC1uVJ4qKKJf_o6lhP5hd82PmhbpnrIQ8p1H_oCIQCiTNP7M0F1wee7b8u07tDFWcve9nyh3qro5vwlt5AsBw%3D%3D&title=aleksandr-nevskiy-istoriceskiy-rej-sergey-eyzensteyn-1938-g_(videomega.ru)", R.drawable.alexander_nevsky, Genre.HISTORY)

        , Movie("Белые розы", 1968,
            "В Москву из деревни продавать домашнюю ветчину приезжает замужняя женщина и мать двоих детей Нюра. И первый, кто ей встречается — неожиданно интеллигентный водитель такси, который должен подвезти её к золовке, сестре мужа, живущей возле кафе «Три тополя» на Плющихе. Эта случайная и очень значимая для обоих встреча сближает прежде незнакомых друг другу людей и заставляет их по-новому посмотреть на свою жизнь, однако продолжения этого знакомства не случается.",
            "СССР", "https://redirector.googlevideo.com/videoplayback?expire=1593364266&ei=ynr4XuSrD8zzyAX8poHABw&ip=2a06%3Ac006%3Afa5c%3Ab7df%3Ab0ba%3A11db%3A7de9%3Aa889&id=o-AE00QcddbC5VDf-xmYXZ-ti8L_tO4Zbq7ov-LsFvkHR9&itag=22&source=youtube&requiressl=yes&mh=tS&mm=31%2C29&mn=sn-4pvgq-n8vs%2Csn-n8v7znsd&ms=au%2Crdu&mv=u&mvi=4&pcm2cms=yes&pl=32&vprv=1&mime=video%2Fmp4&ratebypass=yes&dur=5015.486&lmt=1579377889334371&mt=1593342044&fvip=10&c=WEB&txp=5432432&sparams=expire%2Cei%2Cip%2Cid%2Citag%2Csource%2Crequiressl%2Cvprv%2Cmime%2Cratebypass%2Cdur%2Clmt&sig=AOq0QJ8wRAIgQ60urrc3WGqoxzycgEB4Tc5G46sxKLF9aaBaILgk9GgCIH0XgKOMVKvMHBe6btZx2cYRGEi_puh9TIoHGS5LrvZ9&lsparams=mh%2Cmm%2Cmn%2Cms%2Cmv%2Cmvi%2Cpcm2cms%2Cpl&lsig=AG3C_xAwRgIhANqT8dC4-T0fz8Ji5yIuZGr0A98NFqIeOkPFNBM4JLfQAiEA_YlTyJAsqYUKf2gowzkAFsDFdHOPV-Az686yPLIuaxI%3D&title=belie-rosi-white-dew-1983-film-smotret-onlayn_(videomega.ru)", R.drawable.three_poplars_at_plyushchikha, Genre.MELODRAMA)
    )

    private val moviesWithImages: List<Movie> by lazy {
        movies.map {
            it.imageAsset = imageFromResource(resources, it.preview)
            it
        }
    }
    private val moviesByGenre = allMovies().groupBy { it.genre }

    override fun allMovies(): List<Movie> {
        return moviesWithImages
    }

    override fun moviesFor(genre: Genre): List<Movie> {
        return moviesByGenre[genre] ?: listOf()
    }

    override fun genres(): List<Genre> {
        return Genre.values().toList()
    }

}