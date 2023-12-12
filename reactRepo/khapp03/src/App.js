import './App.css';

function Kheader(){
  return <h1>헤더@.@</h1>;
}

function KhNavi() {
  return <div className="naviWrap">
    <KhNaviItem />
    <KhNaviItem />
    <KhNaviItem />
    <KhNaviItem />
  </div>;
}

function KhNaviItem() {
  return <span>공지사항</span>;
}

function App() {
  return (

    <>
      {/* 닫는 태그 필요없는 태그 */}
      <Kheader />
      <KhNavi />
    </>

  );
}

export default App;
