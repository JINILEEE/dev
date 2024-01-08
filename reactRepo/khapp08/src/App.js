import './App.css';
import Header from './component/Header';
import Main from './component/Main';
import { KhMemory, KhMemoryProvider } from './context/KhContext';

function App() {
  
  return (
    <>
      <KhMemoryProvider>
        <Header />
        <Main />
      </KhMemoryProvider>
    </>
  );
}

export default App;
