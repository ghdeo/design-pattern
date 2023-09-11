
import lombok.AllArgsConstructor;
import lombok.Builder;

@AllArgsConstructor
@Builder
public class ArticleLombok {
    // final 키워드로 필드들을 불변 객체로 만든다.
    private final String id;
    private final String title;
    private final String content;
    private final ArticleType articleType;
}
