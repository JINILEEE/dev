export default function BookList(){

    const book1 ={
        title: "해리포터:돌",
        writer: "홍길동"
    };
    const book2 ={
        title: "해리포터:비밀방",
        writer: "홍길은"
    };
    const book3 ={
        title: "해리포터:불사조",
        writer: "홍길금"
    };

    const bookList = [book1, book2, book3];

    return (<>
        
        <div className="bookListWrap">
            <table>
                <thead>
                    <tr>
                        <th>제목</th>
                        <th>저자</th>
                    </tr>
                </thead>
                <tbody>
                    { bookList.map( (x) => {
                        return <tr>
                            <td>{ x.title }</td>
                            <td>{ x.writer }</td>
                        </tr>;
                    } ) }
                    
                </tbody>
            </table>
        </div>

    </>);
}